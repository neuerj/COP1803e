//
//  COTPGraphics.m
//  CenterOfThePlate
//
//  Created by Scott Saia on 2/15/16.
//  Copyright © 2016 Saiabernetics. All rights reserved.
//

#import "COTPGraphics.h"

@implementation COTPGraphics

+ (NSArray *)menuBackgrounds
{
    return @[COTP_MENU_BACKGROUND_OLD_PAPER,
             COTP_MENU_BACKGROUND_LEATHER,
             COTP_MENU_BACKGROUND_WHITE,
             COTP_MENU_BACKGROUND_FABRIC,
             COTP_MENU_BACKGROUND_SANDBAG,
             COTP_MENU_BACKGROUND_RICE_PAPER,
             COTP_MENU_BACKGROUND_WOOD];
}

// concrete subclass methods
// must implement if used
+ (UIColor *)baseColor {
    // concrete subclass must implement
    return nil;
}
    
+ (UIColor *)altColor {
    // concrete subclass must implement
    return nil;
}
// implemented in this class
+ (UIColor *)blackColor {
    UIColor *color = [UIColor colorWithRed:RED_COOL_BLACK
                                     green:GREEN_COOL_BLACK
                                      blue:BLUE_COOL_BLACK
                                     alpha:ALPHA_COOL_BLACK];
    return color;
}
+ (UIColor *)whiteColor {
    UIColor *color = [UIColor colorWithRed:RED_WHITE
                                     green:GREEN_WHITE
                                      blue:BLUE_WHITE
                                     alpha:ALPHA_WHITE];
    return color;
}


+ (void)setupShadowInRect:(CGRect)rect
            withImageRect:(CGRect)imageRect
           useRoundedRect:(BOOL)useRoundedRect
{
    // dont save and restore context here - it will erase shadowing
    CGContextRef context = UIGraphicsGetCurrentContext();
    // setup so shadows draw
    UIColor *black = [self blackColor];
    CGFloat width = MIN(rect.size.width, rect.size.height);
    CGSize offset = CGSizeMake(-width * COTP_SHADOW_OFFSET_PERCENT / 2,
                               width * COTP_SHADOW_OFFSET_PERCENT);
    CGFloat blur = width * COTP_SHADOW_OFFSET_PERCENT / 2;
    UIBezierPath *shadow = [UIBezierPath bezierPathWithOvalInRect:imageRect];
    if (useRoundedRect) shadow = [UIBezierPath bezierPathWithRoundedRect:rect cornerRadius:rect.size.width * CORNER_SIZE_RATIO];
    
    // Save the state so we can undo the shadow and clipping later
    CGContextSaveGState(context);
    
    // allow antialiasing
    CGContextSetAllowsAntialiasing(context, YES);
    CGContextSetShouldAntialias(context, YES);
    
    [black setFill];
    CGContextSetShadowWithColor(context, offset, blur, black.CGColor);
    
    // Now draw the path in the clipped context
    CGContextAddPath(context, shadow.CGPath);
    CGContextDrawPath(context, kCGPathFill);
    
    CGContextRestoreGState(context); // Go back to before the clipping and before the shadow
}

+ (void)drawMenuBackground:(NSString *)backgroundkey
                    inRect:(CGRect)rect
{
    // if white
    if ([backgroundkey isEqualToString:COTP_MENU_BACKGROUND_WHITE]) {
        // white
        UIColor *white = [UIColor whiteColor];
        [white setFill];
        UIRectFill(rect);
    } else if ([backgroundkey isEqualToString:COTP_MENU_BACKGROUND_OLD_PAPER]) {
        // draw old paper
        UIImage *oldPaper = [UIImage imageNamed:@"oldPaper.jpg"];
        [oldPaper drawInRect:rect];
    } else if ([backgroundkey isEqualToString:COTP_MENU_BACKGROUND_LEATHER]) {
        UIImage *leatherImage = [UIImage imageNamed:@"white_leather_@2X.png"];
        UIColor *leather = [UIColor colorWithPatternImage:leatherImage];
        UIGraphicsBeginImageContext(rect.size);
        [leather setFill];
        UIRectFill(rect);
        UIImage *cellImage = UIGraphicsGetImageFromCurrentImageContext();
        UIGraphicsEndImageContext();
        [cellImage drawInRect:rect];
    } else if ([backgroundkey isEqualToString:COTP_MENU_BACKGROUND_SANDBAG]) {
        UIImage *sandbagImage = [UIImage imageNamed:@"grey_sandbag_@2X.png"];
        UIColor *sandbag = [UIColor colorWithPatternImage:sandbagImage];
        UIGraphicsBeginImageContext(rect.size);
        [sandbag setFill];
        UIRectFill(rect);
        UIImage *cellImage = UIGraphicsGetImageFromCurrentImageContext();
        UIGraphicsEndImageContext();
        [cellImage drawInRect:rect];
    } else if ([backgroundkey isEqualToString:COTP_MENU_BACKGROUND_FABRIC]) {
        UIImage *fabricImage = [UIImage imageNamed:@"cheap_diagonal_fabric.png"];
        UIColor *fabric = [UIColor colorWithPatternImage:fabricImage];
        UIGraphicsBeginImageContext(rect.size);
        [fabric setFill];
        UIRectFill(rect);
        UIImage *cellImage = UIGraphicsGetImageFromCurrentImageContext();
        UIGraphicsEndImageContext();
        [cellImage drawInRect:rect];
    } else if ([backgroundkey isEqualToString:COTP_MENU_BACKGROUND_RICE_PAPER]) {
        UIImage *ricePaperImage = [UIImage imageNamed:@"ricepaper_v3_@2X.png"];
        UIColor *ricePaper = [UIColor colorWithPatternImage:ricePaperImage];
        UIGraphicsBeginImageContext(rect.size);
        [ricePaper setFill];
        UIRectFill(rect);
        UIImage *cellImage = UIGraphicsGetImageFromCurrentImageContext();
        UIGraphicsEndImageContext();
        [cellImage drawInRect:rect];
    } else if ([backgroundkey isEqualToString:COTP_MENU_BACKGROUND_WOOD]) {
        UIImage *woodImage = [UIImage imageNamed:@"retina_wood_@2X.png"];
        UIColor *wood = [UIColor colorWithPatternImage:woodImage];
        UIGraphicsBeginImageContext(rect.size);
        [wood setFill];
        UIRectFill(rect);
        UIImage *cellImage = UIGraphicsGetImageFromCurrentImageContext();
        UIGraphicsEndImageContext();
        [cellImage drawInRect:rect];
    }
}



#define ALPHA 1.0f
#define LOCATION1 0.0f
#define LOCATION2 0.6f
#define LOCATION3 1.0f

+ (void)drawTwoColorGradient:(CGContextRef)context
                      inRect:(CGRect)rect
                withColorOne:(UIColor *)colorOne
                 andColorTwo:(UIColor *)colorTwo
{
    CGColorSpaceRef colorSpace = CGColorSpaceCreateDeviceRGB();
    
    CGFloat red1, green1, blue1, alpha1;
    CGFloat red2, green2, blue2, alpha2;
    [colorOne getRed:&red1 green:&green1 blue:&blue1 alpha:&alpha1];
    [colorTwo getRed:&red2 green:&green2 blue:&blue2 alpha:&alpha2];
    
    CGFloat colors[8] = {red2, green2, blue2, alpha2, red1, green1, blue1, alpha1};
    
    CGFloat locations[2] = {LOCATION1, LOCATION3};
    
    CGGradientRef gradient = CGGradientCreateWithColorComponents(colorSpace, colors, locations, 2);
    
    CGContextDrawLinearGradient(context,
                                gradient,
                                CGPointMake(rect.origin.x, rect.origin.y), CGPointMake(rect.origin.x, rect.size.height),
                                kCGGradientDrawsAfterEndLocation | kCGGradientDrawsBeforeStartLocation);
    CGGradientRelease(gradient); // CG memory mgt - create was used above
    CGColorSpaceRelease(colorSpace); // ditto
}


#pragma backChevronImage

#define CHEVRON_CORNER_OFFSET 0.15

+ (UIImage *)backChevronImage:(CGSize)rectSize
{
    if (rectSize.width == 0 || rectSize.height == 0) return nil;
    
    UIGraphicsBeginImageContextWithOptions(rectSize, NO, 0.0); // 0.0 means use devices main screen scale
    
    CGContextRef context = UIGraphicsGetCurrentContext();
    
    // flip y axis
    CGContextTranslateCTM(context, 0.0, rectSize.height);
    CGContextScaleCTM(context, 1.0, -1.0);
    
    CGFloat cornerOffset = rectSize.width * CHEVRON_CORNER_OFFSET;
    
    UIBezierPath *backChevron = [UIBezierPath bezierPath];
    backChevron.lineWidth = 2.0;
    [backChevron moveToPoint:CGPointMake(rectSize.width, cornerOffset)];
    [backChevron addLineToPoint:CGPointMake(cornerOffset * 2, rectSize.height / 2)];
    [backChevron addLineToPoint:CGPointMake(rectSize.width, rectSize.height - cornerOffset)];
    [backChevron addLineToPoint:CGPointMake(rectSize.width - cornerOffset, rectSize.height)];
    [backChevron addLineToPoint:CGPointMake(0, rectSize.height / 2)];
    [backChevron addLineToPoint:CGPointMake(rectSize.width - cornerOffset, 0)];
    [backChevron closePath];
    [[UIColor blackColor] setFill];
    [backChevron fill];
    
    UIImage *image = UIGraphicsGetImageFromCurrentImageContext();
    UIGraphicsEndImageContext();
    
    return image;
}

+ (UIImage *)tableViewCellAccessoryDisclosureIndicatorWithColor:(UIColor *)color;
{
    CGSize size = CGSizeMake(9, 15);
    
    UIGraphicsBeginImageContextWithOptions(size, NO, 0.0); // 0.0 means use devices main screen scale
    
    CGContextRef context = UIGraphicsGetCurrentContext();
    
    // flip y axis
    CGContextTranslateCTM(context, 0.0, size.height);
    CGContextScaleCTM(context, 1.0, -1.0);

    CGFloat cornerOffset = size.width * CHEVRON_CORNER_OFFSET;

    UIBezierPath *forwardChevron = [UIBezierPath bezierPath];
    forwardChevron.lineWidth = 2.0;
    [forwardChevron moveToPoint:CGPointMake(0, cornerOffset)];
    [forwardChevron addLineToPoint:CGPointMake(size.width - cornerOffset * 2, size.height / 2)];
    [forwardChevron addLineToPoint:CGPointMake(0, size.height - cornerOffset)];
    [forwardChevron addLineToPoint:CGPointMake(cornerOffset, size.height)];
    [forwardChevron addLineToPoint:CGPointMake(size.width, size.height / 2)];
    [forwardChevron addLineToPoint:CGPointMake(cornerOffset, 0)];
    [forwardChevron closePath];
    [color setFill];
    [forwardChevron fill];
    
    UIImage *image = UIGraphicsGetImageFromCurrentImageContext();
    UIGraphicsEndImageContext();
    
    return image;
}


#pragma mark - Draw Action symbol

#define ACTION_SYMBOL_WIDTH 8.0
#define ACTION_SYMBOL_HEIGHT 11.0

+ (void)drawActionSymbol:(CGRect)rect
               inContext:(CGContextRef)context
{
    // flip y axis
    CGContextTranslateCTM(context, 0.0, rect.size.height);
    CGContextScaleCTM(context, 1.0, -1.0);
    
    // scale icon to 90% rect min size so always same
    CGFloat minRectDim = MIN(rect.size.width, rect.size.height);
    CGFloat scale = 0.9 * MIN(minRectDim / ACTION_SYMBOL_WIDTH,
                              minRectDim / ACTION_SYMBOL_HEIGHT);
    CGPoint origin = CGPointMake((rect.size.width - ACTION_SYMBOL_WIDTH * scale) / 2 + rect.origin.x,
                                 (rect.size.height - ACTION_SYMBOL_HEIGHT * scale) / 2 + rect.origin.y);
    UIBezierPath *actionSymbolPath = [UIBezierPath bezierPath];
    // draw box with hole in top
    [actionSymbolPath moveToPoint:CGPointMake(3 * scale + origin.x,
                                              8 * scale + origin.y)];
    [actionSymbolPath addLineToPoint:CGPointMake(0 * scale + origin.x,
                                                 8 * scale + origin.y)];
    [actionSymbolPath addLineToPoint:CGPointMake(0 * scale + origin.x,
                                                 0 * scale + origin.y)];
    [actionSymbolPath addLineToPoint:CGPointMake(8 * scale + origin.x,
                                                 0 * scale + origin.y)];
    [actionSymbolPath addLineToPoint:CGPointMake(8 * scale + origin.x,
                                                 8 * scale + origin.y)];
    [actionSymbolPath addLineToPoint:CGPointMake(5 * scale + origin.x,
                                                 8 * scale + origin.y)];
    // draw arrow
    [actionSymbolPath moveToPoint:CGPointMake(4 * scale + origin.x,
                                              4 * scale + origin.y)];
    [actionSymbolPath addLineToPoint:CGPointMake(4 * scale + origin.x,
                                                 11 * scale + origin.y)];
    [actionSymbolPath moveToPoint:CGPointMake(2 * scale + origin.x,
                                              9 * scale + origin.y)];
    [actionSymbolPath addLineToPoint:CGPointMake(4 * scale + origin.x,
                                                 11 * scale + origin.y)];
    [actionSymbolPath addLineToPoint:CGPointMake(6 * scale + origin.x,
                                                 9 * scale + origin.y)];
    [actionSymbolPath stroke];
}




#pragma mark - draw Shopping Cart

#define SHOP_CART_SYMBOL_WIDTH 20.0
#define SHOP_CART_SYMBOL_HEIGHT 15.0

+ (void)drawShoppingCart:(CGRect)rect
               inContext:(CGContextRef)context
{
    // flip the coordinate system before we start drawing
    CGContextTranslateCTM(context, 0.0, rect.size.height);
    CGContextScaleCTM(context, 1.0, -1.0);
    
    // set scale to rect
    CGFloat scale = 0.8 * MIN(rect.size.width / SHOP_CART_SYMBOL_WIDTH,
                              rect.size.height / SHOP_CART_SYMBOL_HEIGHT);
    // set origin to be centered
    CGPoint origin = CGPointMake((rect.size.width - SHOP_CART_SYMBOL_WIDTH * scale) / 2,
                                 (rect.size.height - SHOP_CART_SYMBOL_HEIGHT * scale) / 2);
    // make shopping cart path
    UIBezierPath *shopCart = [UIBezierPath bezierPath];
    // draw cart
    [shopCart moveToPoint:CGPointMake(origin.x + 0.0 * scale,
                                       origin.y + 15.0 * scale)];
    [shopCart addLineToPoint:CGPointMake(origin.x + 3.0 * scale,
                                         origin.y + 14.0 * scale)];
    [shopCart addLineToPoint:CGPointMake(origin.x + 6.0 * scale,
                                         origin.y + 5.0 * scale)];
    [shopCart addLineToPoint:CGPointMake(origin.x + 19.0 * scale,
                                         origin.y + 6.0 * scale)];
    [shopCart addLineToPoint:CGPointMake(origin.x + 20.0 * scale,
                                         origin.y + 12.0 * scale)];
    [shopCart addLineToPoint:CGPointMake(origin.x + 3.67 * scale,
                                         origin.y + 12.0 * scale)];
    // draw base frame
    [shopCart moveToPoint:CGPointMake(origin.x + 19.0 * scale,
                                      origin.y + 3.0 * scale)];
    [shopCart addLineToPoint:CGPointMake(origin.x + 6.0 * scale,
                                         origin.y + 3.0 * scale)];
    [shopCart addCurveToPoint:CGPointMake(origin.x + 6.0 * scale,
                                          origin.y + 5.0 * scale)
                controlPoint1:CGPointMake(origin.x + 4.0 * scale,
                                          origin.y + 3.0 * scale)
                controlPoint2:CGPointMake(origin.x + 4.0 * scale,
                                          origin.y + 5.0 * scale)];
    // draw wheels
    CGPoint center1 = CGPointMake(origin.x + 5.5 * scale,
                                  origin.y + 1.5 * scale);
    CGPoint center2 = CGPointMake(origin.x + 18.5 * scale,
                                  origin.y + 1.5 * scale);
    UIBezierPath *wheelBackInner = [UIBezierPath bezierPathWithArcCenter:center1
                                                                  radius:0.5 * scale
                                                              startAngle:0.0
                                                                endAngle:M_PI * 2
                                                               clockwise:YES];
    UIBezierPath *wheelBackOuter = [UIBezierPath bezierPathWithArcCenter:center1
                                                                  radius:1.5 * scale
                                                              startAngle:0.0
                                                                endAngle:M_PI * 2
                                                               clockwise:YES];
    UIBezierPath *wheelFrontInner = [UIBezierPath bezierPathWithArcCenter:center2
                                                                   radius:0.5 * scale
                                                               startAngle:0.0
                                                                 endAngle:M_PI * 2
                                                                clockwise:YES];
    UIBezierPath *wheelFrontOuter = [UIBezierPath bezierPathWithArcCenter:center2
                                                                   radius:1.5 * scale
                                                               startAngle:0.0
                                                                 endAngle:M_PI * 2
                                                                clockwise:YES];
    [shopCart stroke];
    [wheelBackOuter stroke];
    [wheelBackInner stroke];
    [wheelBackInner fill];
    [wheelFrontOuter stroke];
    [wheelFrontInner stroke];
    [wheelFrontInner fill];
}



#pragma mark - draw Gear

#define GEAR_SYMBOL_WIDTH 28.0
#define GEAR_SYMBOL_HEIGHT 28.0
#define GEAR_TOOTH_COUNT 10

+ (void)drawGear:(CGRect)rect
       inContext:(CGContextRef)context
{
    // flip the coordinate system before we start drawing
    CGContextTranslateCTM(context, 0.0, rect.size.height);
    CGContextScaleCTM(context, 1.0, -1.0);
    
    // set scale to rect
    CGFloat scale = 0.9 * MIN(rect.size.width / GEAR_SYMBOL_WIDTH,
                              rect.size.height / GEAR_SYMBOL_HEIGHT);
    // set origin to be centered
    CGPoint origin = CGPointMake((rect.size.width - GEAR_SYMBOL_WIDTH * scale) / 2,
                                 (rect.size.height - GEAR_SYMBOL_HEIGHT * scale) / 2);
    CGPoint center = CGPointMake(CGRectGetMidX(rect),
                                 CGRectGetMidY(rect));
    // make gear path
    UIBezierPath *gearTooth = [UIBezierPath bezierPath];
    [gearTooth moveToPoint:CGPointMake(origin.x + 12 * scale,
                                       origin.y + 3.0 * scale)];
    [gearTooth addLineToPoint:CGPointMake(origin.x + 12.5 * scale,
                                          origin.y + 0.0 * scale)];
    [gearTooth addLineToPoint:CGPointMake(origin.x + 15.5 * scale,
                                          origin.y + 0.0 * scale)];
    [gearTooth addLineToPoint:CGPointMake(origin.x + 16.0 * scale,
                                          origin.y + 3.0 * scale)];
    // iterate rotating context and drawing a gear tooth
    CGFloat segmentAngle = M_PI * 2 / GEAR_TOOTH_COUNT;
    for (CGFloat angle = 0.0; angle < M_PI * 2; angle += segmentAngle) {
        CGContextSaveGState(context);
        CGContextTranslateCTM(context, center.x, center.y);
        CGContextRotateCTM(context, angle);
        CGContextTranslateCTM(context, -center.x, -center.y);
        [gearTooth stroke];
        [gearTooth fill];
        CGContextRestoreGState(context);
    }
    // find radius of outer circle from bottom of a gear tooth
    CGFloat radiusOuter = sqrtf(powf(1.5 * scale, 2) + powf(11.0 * scale, 2));
    // draw dual circle and fill for outer gear
    UIBezierPath *gearOuter = [UIBezierPath bezierPathWithArcCenter:center
                                                             radius:radiusOuter
                                                         startAngle:0.0
                                                           endAngle:M_PI * 2
                                                          clockwise:YES];
    CGFloat radiusOuterInner = radiusOuter * 0.85;
    // must move to next circle or will make a line between
    [gearOuter moveToPoint:CGPointMake(center.x + radiusOuterInner, center.y + 0.0)];
    [gearOuter addArcWithCenter:center
                         radius:radiusOuterInner
                     startAngle:M_PI * 2 // do in reverse from above
                       endAngle:0.0
                      clockwise:NO];
    [gearOuter stroke];
    [gearOuter fill];
    // draw axle
    UIBezierPath *axle = [UIBezierPath bezierPathWithArcCenter:center
                                                        radius:3.0 * scale
                                                    startAngle:0.0
                                                      endAngle:M_PI * 2
                                                     clockwise:YES];
    [axle fill];
}



#pragma mark - Circle

+ (void)drawGradientCircleWithBaseColor:(UIColor *)baseColor
                          gradientColor:(UIColor *)gradientColor
                                 inRect:(CGRect)rect
                              endRadius:(CGFloat)endRadius
                           clipToCircle:(BOOL)clipToCircle
{
    CGContextRef context = UIGraphicsGetCurrentContext();
    CGContextSaveGState(context);
    // make a square
    CGFloat length = MIN(rect.size.width, rect.size.height);
    CGRect square = CGRectMake(rect.origin.x + (rect.size.width - length) / 2,
                               rect.origin.y + (rect.size.height - length) / 2,
                               length,
                               length);
    if (clipToCircle) {
        UIBezierPath *circle = [UIBezierPath bezierPathWithOvalInRect:square];
        [circle addClip];
    }
    CGFloat components[8] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
    [gradientColor getRed:&components[0] green:&components[1] blue:&components[2] alpha:&components[3]];
    [baseColor getRed:&components[4] green:&components[5] blue:&components[6] alpha:&components[7]];
    // 2 locations
    CGFloat locations[] = {0.0,1.0};
    // create a gradient
    CGColorSpaceRef colorSpace = CGColorSpaceCreateDeviceRGB();
    CGGradientRef gradient = CGGradientCreateWithColorComponents(colorSpace,
                                                                 components,
                                                                 locations,
                                                                 2);
    CGPoint point1 = CGPointMake(square.origin.x + square.size.width * 0.30,
                                 square.origin.y + square.size.height * 0.20);
    CGPoint center = CGPointMake(square.origin.x + square.size.width / 2,
                                 square.origin.y + square.size.height / 2);
    CGContextDrawRadialGradient(context,
                                gradient,
                                point1, // start center
                                square.size.width * 0.0, // start radius
                                center, // end center
                                square.size.width * endRadius, // end radius
                                kCGGradientDrawsBeforeStartLocation|kCGGradientDrawsAfterEndLocation); // options
    CGColorSpaceRelease(colorSpace);
    CGGradientRelease(gradient);
    CGContextRestoreGState(context);
}

+ (void)drawBlackCircleInRect:(CGRect)rect
{
    CGContextRef context = UIGraphicsGetCurrentContext();
    CGContextSaveGState(context);
    CGPoint center = CGPointMake(rect.origin.x + rect.size.width / 2,
                                 rect.origin.y + rect.size.height / 2);
    // draw text circle
    UIBezierPath *textCircle = [UIBezierPath bezierPathWithArcCenter:center
                                                              radius:rect.size.width / 2 * 0.65
                                                          startAngle:0
                                                            endAngle:M_PI * 2
                                                           clockwise:YES];
    UIColor *black = [self blackColor];
    [black setFill];
    [textCircle fill];
    CGContextRestoreGState(context);
}


#define EYEBALL_IMAGE_WIDTH 8 // design is 8W x 6H points
#define EYEBALL_IMAGE_HEIGHT 6

+ (void)drawEyeball:(CGSize)size
          bloodshot:(BOOL)bloodshot
{
    // scale icon to size
    CGFloat scale = MIN((size.width - 3) / EYEBALL_IMAGE_WIDTH,
                        (size.height - 3) / EYEBALL_IMAGE_HEIGHT);
    // set origin at 1,1
    CGPoint origin = CGPointMake(floorf((size.width - EYEBALL_IMAGE_WIDTH * scale) / 2) + 1,
                                 floorf((size.height - EYEBALL_IMAGE_HEIGHT * scale) / 2) + 1);
    // draw eyeball
    UIBezierPath *eyeballPath = [UIBezierPath bezierPath]; // initiate a path
    eyeballPath.lineCapStyle = kCGLineCapRound; // round ends
    
    [eyeballPath moveToPoint:CGPointMake(0 * scale + origin.x, 3 * scale + origin.y)];
    [eyeballPath addCurveToPoint:CGPointMake(8 * scale + origin.x, 3 * scale + origin.y)
                   controlPoint1:CGPointMake(1 * scale + origin.x, 0 * scale + origin.y)
                   controlPoint2:CGPointMake(7 * scale + origin.x, 0 * scale + origin.y)];
    [eyeballPath addCurveToPoint:CGPointMake(0 * scale + origin.x, 3 * scale + origin.y)
                   controlPoint1:CGPointMake(6 * scale + origin.x, 6 * scale + origin.y)
                   controlPoint2:CGPointMake(2 * scale + origin.x, 6 * scale + origin.y)];
    UIBezierPath *pupilPath = [UIBezierPath bezierPath];
    [pupilPath addArcWithCenter:CGPointMake(4 * scale + origin.x, 3 * scale + origin.y)
                         radius:scale * 1.2
                     startAngle:0
                       endAngle:2 * M_PI
                      clockwise:YES];
    [eyeballPath stroke];
    [pupilPath stroke];
    [pupilPath fill];
    
    if (bloodshot) {
        UIBezierPath *eyeVeins = [UIBezierPath bezierPath];
        eyeVeins.lineWidth = 0.5;
        
        [eyeVeins moveToPoint:CGPointMake(0 * scale + origin.x, 3 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(2 * scale + origin.x, 2.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(2.5 * scale + origin.x, 3.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(3 * scale + origin.x, 3 * scale + origin.y)];
        
        [eyeVeins moveToPoint:CGPointMake(2.5 * scale + origin.x, 1.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(2 * scale + origin.x, 2 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(2 * scale + origin.x, 3.5 * scale + origin.y)];
        
        [eyeVeins moveToPoint:CGPointMake(4 * scale + origin.x, 2 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(3.5 * scale + origin.x, 1.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(4.5 * scale + origin.x, 1 * scale + origin.y)];
        
        [eyeVeins moveToPoint:CGPointMake(5 * scale + origin.x, 2.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(5.5 * scale + origin.x, 1.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(6 * scale + origin.x, 2 * scale + origin.y)];
        
        [eyeVeins moveToPoint:CGPointMake(5 * scale + origin.x, 3 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(5.5 * scale + origin.x, 2.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(6.5 * scale + origin.x, 3.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(7 * scale + origin.x, 2.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(8 * scale + origin.x, 3 * scale + origin.y)];
        
        [eyeVeins moveToPoint:CGPointMake(3.5 * scale + origin.x, 4 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(3 * scale + origin.x, 4.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(3.5 * scale + origin.x, 5 * scale + origin.y)];
        
        [eyeVeins moveToPoint:CGPointMake(4 * scale + origin.x, 4 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(4.5 * scale + origin.x, 4.5 * scale + origin.y)];
        [eyeVeins addLineToPoint:CGPointMake(5.5 * scale + origin.x, 4.5 * scale + origin.y)];
        
        [eyeVeins stroke];
    }
}

+ (void)drawMenuGradientInRect:(CGRect)rect
{
    UIColor *baseColor = [self baseColor];
    UIColor *altColor = [self altColor];
    NSArray *colors = @[baseColor, altColor, altColor, altColor, altColor, altColor, baseColor];
    [self drawGradient:UIGraphicsGetCurrentContext()
                inRect:rect
            withColors:colors
            horizontal:YES];
    // wash over with some white
    [[UIColor colorWithWhite:1.0 alpha:0.5] setFill];
    UIRectFill(rect);
}

+ (void)drawGradient:(CGContextRef)context
              inRect:(CGRect)rect
          withColors:(NSArray *)colors
          horizontal:(BOOL)horizontal
{
    UIColor *previousColor = colors.firstObject;
    NSInteger count = colors.count;
    CGFloat red1, green1, blue1, alpha1;
    CGFloat red2, green2, blue2, alpha2;
    for (NSInteger i = 0; i < count; i++) {
        UIColor *nextColor = nil;
        // check for end case crash
        if (i < count - 1) {
            nextColor = colors[i + 1];
        }
        CGColorSpaceRef colorSpace = CGColorSpaceCreateDeviceRGB();
        [previousColor getRed:&red1 green:&green1 blue:&blue1 alpha:&alpha1];
        [nextColor getRed:&red2 green:&green2 blue:&blue2 alpha:&alpha2];
        CGFloat colors[8] = {red1, green1, blue1, alpha1, red2, green2, blue2, alpha2};
        CGFloat locations[2] = {0.2, 0.8};
        CGGradientRef gradient = CGGradientCreateWithColorComponents(colorSpace, colors, locations, 2);
        NSInteger numberOfGradients = count - 1;
        if (horizontal) {
            CGContextDrawLinearGradient(context,
                                        gradient,
                                        CGPointMake(rect.origin.x + rect.size.width / numberOfGradients * i,
                                                    rect.origin.y),
                                        CGPointMake(rect.origin.x + rect.size.width / numberOfGradients * (i + 1),
                                                    rect.origin.y),
                                        0);
        } else {
            CGContextDrawLinearGradient(context,
                                        gradient,
                                        CGPointMake(rect.origin.x,
                                                    rect.origin.y + rect.size.height / numberOfGradients * i),
                                        CGPointMake(rect.origin.x,
                                                    rect.origin.y + rect.size.height / numberOfGradients * (i + 1)),
                                        0);
        }
        CGGradientRelease(gradient); // CG memory mgt - create was used above
        CGColorSpaceRelease(colorSpace); // ditto
        previousColor = nextColor; // store color for next go round
    }
}


// returns an opposite color with the given alpha
+ (UIColor *)oppositeColorForColor:(UIColor *)color
                             alpha:(NSNumber *)alpha
{
    const CGFloat *dashesComponentColors = CGColorGetComponents(color.CGColor);
    // get opposite tint color for fill color
    UIColor *oppositeTintColor = [[UIColor alloc] initWithRed:(1.0 - dashesComponentColors[0])
                                                        green:(1.0 - dashesComponentColors[1])
                                                         blue:(1.0 - dashesComponentColors[2])
                                                        alpha:dashesComponentColors[3]];
    return alpha != nil ? [oppositeTintColor colorWithAlphaComponent:[alpha floatValue]] : oppositeTintColor;
}


#pragma mark - OpenInImage

// add +1 in each dimension
#define OPEN_IN_IMAGE_WIDTH 8.0 // design based on 8 width
#define OPEN_IN_IMAGE_HEIGHT 10.0 // design based on 10 width

+ (UIImage *)openInImage:(CGRect)rect
  withBackgroundColorOne:(UIColor *)colorOne
   andBackgroundColorTwo:(UIColor *)colorTwo
{
    if (rect.size.width == 0 || rect.size.height == 0) return nil;
    
    CGFloat scale = MIN((rect.size.width - (rect.size.width * 0.4)) / OPEN_IN_IMAGE_WIDTH,
                        (rect.size.height - (rect.size.height * 0.4)) / OPEN_IN_IMAGE_HEIGHT);
    
    // set origin at 1,1
    CGPoint imageOrigin = CGPointMake(rect.origin.x + floorf((rect.size.width - OPEN_IN_IMAGE_WIDTH * scale) / 2),
                                      rect.origin.y + floorf((rect.size.height - OPEN_IN_IMAGE_HEIGHT * scale) / 2));
    
    UIGraphicsBeginImageContextWithOptions(rect.size, YES, 0.0); // 0.0 means use devices main screen scale
    
    CGContextRef context = UIGraphicsGetCurrentContext();
    
    // flip y axis
    CGContextTranslateCTM(context, 0.0, rect.size.height);
    CGContextScaleCTM(context, 1.0, -1.0);
    
    // First fill the background with gradient background color
    [self drawTwoColorGradient:context inRect:rect withColorOne:colorOne andColorTwo:colorTwo];
    
    // draw rectangle
    UIBezierPath *openInPath = [UIBezierPath bezierPath];
    [openInPath moveToPoint:CGPointMake(3 * scale + imageOrigin.x,
                                        8 * scale + imageOrigin.y)];
    [openInPath addLineToPoint:CGPointMake(0 * scale + imageOrigin.x,
                                           8 * scale + imageOrigin.y)];
    [openInPath addLineToPoint:CGPointMake(0 * scale + imageOrigin.x,
                                           0 * scale + imageOrigin.y)];
    [openInPath addLineToPoint:CGPointMake(8 * scale + imageOrigin.x,
                                           0 * scale + imageOrigin.y)];
    [openInPath addLineToPoint:CGPointMake(8 * scale + imageOrigin.x,
                                           8 * scale + imageOrigin.y)];
    [openInPath addLineToPoint:CGPointMake(5 * scale + imageOrigin.x,
                                           8 * scale + imageOrigin.y)];
    
    // draw arrow
    [openInPath moveToPoint:CGPointMake(4 * scale + imageOrigin.x,
                                        4 * scale + imageOrigin.y)];
    [openInPath addLineToPoint:CGPointMake(4 * scale + imageOrigin.x,
                                           10 * scale + imageOrigin.y)];
    [openInPath moveToPoint:CGPointMake(3 * scale + imageOrigin.x,
                                        9 * scale + imageOrigin.y)];
    [openInPath addLineToPoint:CGPointMake(4 * scale + imageOrigin.x,
                                           10 * scale + imageOrigin.y)];
    [openInPath addLineToPoint:CGPointMake(5 * scale + imageOrigin.x,
                                           9 * scale + imageOrigin.y)];
    
    // stroke path
    [[UIColor whiteColor] setStroke];
    [openInPath stroke];
    
    UIImage *image = UIGraphicsGetImageFromCurrentImageContext();
    
    UIGraphicsEndImageContext();
    
    return image;
}


#pragma mark - Mail envelope image

#define MAIL_ENVELOPE_IMAGE_WIDTH 11 // design is 11 x 7 points
#define MAIL_ENVELOPE_IMAGE_HEIGHT 7

+ (UIImage *)mailEnvelopeImage:(CGRect)rect
        withBackgroundColorOne:(UIColor *)colorOne
         andBackgroundColorTwo:(UIColor *)colorTwo
{
    if (rect.size.width == 0 || rect.size.height == 0) return nil;
    
    // scale icon to rect size
    CGFloat scale = MIN((rect.size.width - (rect.size.width * 0.3)) / MAIL_ENVELOPE_IMAGE_WIDTH,
                        (rect.size.height - (rect.size.height * 0.3)) / MAIL_ENVELOPE_IMAGE_HEIGHT);
    
    // set origin at 1,1
    CGPoint imageOrigin = CGPointMake(rect.origin.x + floorf((rect.size.width - MAIL_ENVELOPE_IMAGE_WIDTH * scale) / 2),
                                      rect.origin.y + floorf((rect.size.height - MAIL_ENVELOPE_IMAGE_HEIGHT * scale) / 2));
    
    UIGraphicsBeginImageContextWithOptions(rect.size, NO, 0.0); // 0.0 means use devices main screen scale
    
    CGContextRef context = UIGraphicsGetCurrentContext();
    
    // flip y axis
    CGContextTranslateCTM(context, 0.0, rect.size.height);
    CGContextScaleCTM(context, 1.0, -1.0);
    
    // First fill the background with gradient color
    [self drawTwoColorGradient:context inRect:rect withColorOne:colorOne andColorTwo:colorTwo];
    
    // draw pages
    UIBezierPath *envelopePath = [UIBezierPath bezierPath]; // initiate a path
    envelopePath.lineCapStyle = kCGLineCapRound; // round ends
    
    // bottom
    [envelopePath moveToPoint:CGPointMake(0.5  * scale + imageOrigin.x, 0 * scale + imageOrigin.y)];
    [envelopePath addLineToPoint:CGPointMake(10.5  * scale + imageOrigin.x, 0 * scale + imageOrigin.y)];
    // bottom right corner
    [envelopePath addQuadCurveToPoint:CGPointMake(11 * scale + imageOrigin.x,
                                                  0.5 * scale + imageOrigin.y)
                         controlPoint:CGPointMake(11 * scale + imageOrigin.x,
                                                  0 * scale + imageOrigin.y)];
    // right side
    [envelopePath addLineToPoint:CGPointMake(11  * scale + imageOrigin.x, 6.5 * scale + imageOrigin.y)];
    // top right corner
    [envelopePath addQuadCurveToPoint:CGPointMake(10.5 * scale + imageOrigin.x,
                                                  7 * scale + imageOrigin.y)
                         controlPoint:CGPointMake(11 * scale + imageOrigin.x,
                                                  7 * scale + imageOrigin.y)];
    // top
    [envelopePath addLineToPoint:CGPointMake(0.5 * scale + imageOrigin.x, 7 * scale + imageOrigin.y)];
    // top left corner
    [envelopePath addQuadCurveToPoint:CGPointMake(0 * scale + imageOrigin.x,
                                                  6.5 * scale + imageOrigin.y)
                         controlPoint:CGPointMake(0 * scale + imageOrigin.x,
                                                  7 * scale + imageOrigin.y)];
    
    // left side
    [envelopePath addLineToPoint:CGPointMake(0 * scale + imageOrigin.x, 0.5 * scale + imageOrigin.y)];
    // bottom left corner
    [envelopePath addQuadCurveToPoint:CGPointMake(0.5 * scale + imageOrigin.x,
                                                  0 * scale + imageOrigin.y)
                         controlPoint:CGPointMake(0 * scale + imageOrigin.x,
                                                  0 * scale + imageOrigin.y)];
    // flap
    [envelopePath moveToPoint:CGPointMake(0.25 * scale + imageOrigin.x, 6.75 * scale + imageOrigin.y)];
    [envelopePath addLineToPoint:CGPointMake(4.5 * scale + imageOrigin.x, 3.5 * scale + imageOrigin.y)];
    [envelopePath addQuadCurveToPoint:CGPointMake(6.5 * scale + imageOrigin.x,
                                                  3.5 * scale + imageOrigin.y)
                         controlPoint:CGPointMake(5.5 * scale + imageOrigin.x,
                                                  3 * scale + imageOrigin.y)];
    [envelopePath addLineToPoint:CGPointMake(10.75 * scale + imageOrigin.x, 6.75 * scale + imageOrigin.y)];
    // seams
    [envelopePath moveToPoint:CGPointMake(0.25 * scale + imageOrigin.x, 0.25 * scale + imageOrigin.y)];
    [envelopePath addLineToPoint:CGPointMake(4 * scale + imageOrigin.x, 3.875 * scale + imageOrigin.y)];
    [envelopePath moveToPoint:CGPointMake(10.75 * scale + imageOrigin.x, 0.25 * scale + imageOrigin.y)];
    [envelopePath addLineToPoint:CGPointMake(7 * scale + imageOrigin.x, 3.875 * scale + imageOrigin.y)];
    
    [[UIColor whiteColor] setStroke];
    [envelopePath stroke];
    
    UIImage *image = UIGraphicsGetImageFromCurrentImageContext();
    
    UIGraphicsEndImageContext();
    
    return image;
}

#pragma mark - Text stuff

+ (CGSize)sizeForText:(NSAttributedString *)text
     withBoundingSize:(CGSize)boundingSize
{
    if (text.length > 0) {
        // put string into textstorage
        NSTextStorage *textStorage = [[NSTextStorage alloc] initWithAttributedString:text];
        // make a layout manager
        NSLayoutManager *layoutManager = [[NSLayoutManager alloc] init];
        [textStorage addLayoutManager:layoutManager];
        // and a textContainer
        NSTextContainer *textContainer = [[NSTextContainer alloc] initWithSize:boundingSize];
        textContainer.lineFragmentPadding = 0;
        [layoutManager addTextContainer:textContainer];
        CGRect textRect = [layoutManager boundingRectForGlyphRange:NSMakeRange(0, text.length)
                                                   inTextContainer:textContainer];
        return textRect.size;
    }
    return CGSizeZero;
}


// return size of font needed to fit text in same width as boundingSize
+ (CGFloat)fontSizeForText:(NSAttributedString *)text
          withBoundingSize:(CGSize)boundingSize
{
    // check for empty string
    if (text.length) {
        // get font size
        NSRange range = NSMakeRange(0, 1);
        NSDictionary *attributes = [text attributesAtIndex:0 effectiveRange:&range];
        UIFont *font = attributes[NSFontAttributeName];
        CGFloat fontSize = font.pointSize;
        
        // still need an infinite height size for use
        CGSize infBoundingSize = CGSizeMake(boundingSize.width, CGFLOAT_MAX);
        // get current text size
        CGSize textSize = [self sizeForText:text
                           withBoundingSize:infBoundingSize];
        // if text is wider or taller than boundingSize
        if (textSize.width > boundingSize.width ||
            textSize.height > boundingSize.height) {
            // shrink font size until fits inside width
            while (textSize.width > boundingSize.width ||
                   textSize.height > boundingSize.height) {
                fontSize *= 0.95;
                NSMutableDictionary *mutableDict = [attributes mutableCopy];
                mutableDict[NSFontAttributeName] = [UIFont fontWithName:font.fontName size:fontSize];
                NSAttributedString *attributedText = [[NSAttributedString alloc] initWithString:text.string
                                                                                     attributes:mutableDict];
                textSize = [self sizeForText:attributedText
                            withBoundingSize:infBoundingSize];
            }
        } else { // else grow
            // grow font size until just over sized
            while (textSize.width <= boundingSize.width &&
                   textSize.height <= boundingSize.height) {
                fontSize *= 1.05;
                NSMutableDictionary *mutableDict = [attributes mutableCopy];
                mutableDict[NSFontAttributeName] = [UIFont fontWithName:font.fontName size:fontSize];
                NSAttributedString *attributedText = [[NSAttributedString alloc] initWithString:text.string
                                                                                     attributes:mutableDict];
                textSize = [self sizeForText:attributedText
                            withBoundingSize:infBoundingSize];
            }
            // and then shrink back a bit so just under sized
            fontSize *= 0.95;
        }
        // now find font size for the longest word by itself
        CGFloat longestWordFontSize = [self fontSizeForLongestWordInString:text.string
                                                            withAttributes:attributes
                                                           andBoundingSize:infBoundingSize];
        // return the min
        return MIN(fontSize, longestWordFontSize);
    }
    return 0;
}

+ (CGFloat)fontSizeForLongestWordInString:(NSString *)string
                           withAttributes:(NSDictionary *)attributes
                          andBoundingSize:(CGSize)boundingSize
{
    // find longest word(s)
    NSArray *wordList = [self wordListInText:string];
    NSUInteger length = 0;
    NSMutableArray *longWords = [@[wordList.firstObject] mutableCopy];
    for (NSString *word in wordList) {
        if (word.length == length) {
            [longWords addObject:word];
        } else if (word.length >= length) {
            longWords = [@[word] mutableCopy];
            length = word.length;
        }
    }
    // now should have array with one longest word or more if found
    // find longWord with smallest fontSize for boundingSize
    // get font size from attributes
    CGFloat fontSize = CGFLOAT_MAX;
    for (NSString *longWord in longWords) {
        CGFloat wordFontSize = [self fontSizeForWord:longWord
                                      withAttributes:attributes
                                    withBoundingSize:boundingSize];
        // if smaller
        if (wordFontSize < fontSize) {
            fontSize = wordFontSize;
        }
    }
    return fontSize;
}

+ (NSArray *)wordListInText:(NSString *)string
{
    NSString *separators = @" \n"; // space and newLine
    NSCharacterSet *set = [NSCharacterSet characterSetWithCharactersInString:separators];
    return [string componentsSeparatedByCharactersInSet:set];
}

+ (CGFloat)fontSizeForWord:(NSString *)word
            withAttributes:(NSDictionary *)attributes
          withBoundingSize:(CGSize)boundingSize
{
    // check for empty string or endless loop in while statement below
    if (word.length) {
        // get font size
        UIFont *font = attributes[NSFontAttributeName];
        CGFloat fontSize = font.pointSize;
        NSAttributedString *checkString = [[NSAttributedString alloc] initWithString:word
                                                                          attributes:attributes];
        // if width too wide
        if (checkString.size.width > boundingSize.width) {
            // while width is too wide
            while (checkString.size.width > boundingSize.width) {
                // shrink font a bit
                fontSize *= 0.95;
                NSMutableDictionary *mutableDict = [attributes mutableCopy];
                mutableDict[NSFontAttributeName] = [UIFont fontWithName:font.fontName size:fontSize];
                checkString = [[NSAttributedString alloc] initWithString:word
                                                              attributes:mutableDict];
            }
            // else if width too small
        } else if (checkString.size.width < boundingSize.width) {
            // while width is too small
            // ** warning - endless loop if 0 length string
            while (checkString.size.width < boundingSize.width) {
                // grow font a bit
                fontSize *= 1.05;
                NSMutableDictionary *mutableDict = [attributes mutableCopy];
                mutableDict[NSFontAttributeName] = [UIFont fontWithName:font.fontName size:fontSize];
                checkString = [[NSAttributedString alloc] initWithString:word
                                                              attributes:mutableDict];
            }
            // shrink back once to be just under sized
            fontSize *= 0.95;
        }
        return fontSize;
    }
    // return same size sent
    UIFont *font = attributes[NSFontAttributeName];
    return font.pointSize;
}

@end
