package com.example.android.cop1803;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;

public class UtilsUISystem
{

    private static DeviceType DEVICE_TYPE = null;

    public enum DeviceType
    {

        Smartphone,
        Tab_7,
        Tab_9,
        Tab_10,

        /**
         * Télévision
         */
        Leanback;

        public boolean isLargeTablet ()
        {
            return this == Tab_10 || this == Tab_9;
        }
    }

    private UtilsUISystem ()
    {

    }

    public static boolean hasNavBar (Resources resources)
    {
        //Emulator
        if (Build.FINGERPRINT.startsWith("generic"))
            return true;

        int id = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        return id > 0 && resources.getBoolean(id);
    }

    public static int getStatusBarHeight (Resources resources)
    {
        int result = 0;
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0)
        {
            result = resources.getDimensionPixelSize(resourceId);
            return result;
        }
        return 0;
    }

    public static int getNavigationBarHeight (Resources resources)
    {
        if (!UtilsUISystem.hasNavBar(resources))
            return 0;

        int orientation = resources.getConfiguration().orientation;

        //Only phone between 0-599 has navigationbar can move
        boolean isSmartphone = resources.getConfiguration().smallestScreenWidthDp < 600;
        if (isSmartphone && android.content.res.Configuration.ORIENTATION_LANDSCAPE == orientation)
            return 0;

        int id = resources
                .getIdentifier(orientation == android.content.res.Configuration.ORIENTATION_PORTRAIT ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
        if (id > 0)
            return resources.getDimensionPixelSize(id);

        return 0;
    }

    public static int getNavigationBarWidth (Resources resources)
    {
        if (!UtilsUISystem.hasNavBar(resources))
            return 0;

        int orientation = resources.getConfiguration().orientation;

        //Only phone between 0-599 has navigationbar can move
        boolean isSmartphone = resources.getConfiguration().smallestScreenWidthDp < 600;

        if (orientation == android.content.res.Configuration.ORIENTATION_LANDSCAPE && isSmartphone)
        {
            int id = resources.getIdentifier("navigation_bar_width", "dimen", "android");
            if (id > 0)
                return resources.getDimensionPixelSize(id);
        }

        return 0;
    }

    public static int getDefaultActionBarHeight (Resources resources)
    {
        return resources.getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material);
    }

    public static boolean canEnableTranslucentDecor (Resources resources)
    {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT)
            return false;

        int id = resources.getIdentifier("config_enableTranslucentDecor", "bool", "android");
        if (id > 0)
            return resources.getBoolean(id);

        return true;
    }

    public static boolean getIsTablet (Context context)
    {
        if (DEVICE_TYPE == null)
            DEVICE_TYPE = getDeviceType(context);

        return DEVICE_TYPE == DeviceType.Tab_10 || DEVICE_TYPE == DeviceType.Tab_9 || DEVICE_TYPE == DeviceType.Tab_7;
    }

    public static boolean getIsLargeTablet (Context context)
    {
        DeviceType deviceType = getDeviceType(context);
        return deviceType == DeviceType.Tab_9 || deviceType == DeviceType.Tab_10;
    }

    public static DeviceType getDeviceType (Context context)
    {
        if (DEVICE_TYPE == null)
        {
            Resources res = context.getResources();
          /*  if (res.getBoolean(R.bool.isSmartphone))
                DEVICE_TYPE = DeviceType.Smartphone;
            else if (res.getBoolean(R.bool.isTablet7))
                DEVICE_TYPE = DeviceType.Tab_7;
            else if (res.getBoolean(R.bool.isTablet9))
                DEVICE_TYPE = DeviceType.Tab_9;
            else if (res.getBoolean(R.bool.isTablet10))
                DEVICE_TYPE = DeviceType.Tab_10;
            else if (res.getBoolean(R.bool.isLeanback))
                DEVICE_TYPE = DeviceType.Leanback;
            else
                DEVICE_TYPE = DeviceType.Smartphone;*/
        }

        return DEVICE_TYPE;
    }

    public static void displayScreenInfos (Context context)
    {
        Resources r = context.getResources();
        Log.d("screen", "scaledDensity: " + r.getDisplayMetrics().scaledDensity);
        Log.d("screen", "widthPixels x heightPixels: " + r
                .getDisplayMetrics().widthPixels + " x " + r.getDisplayMetrics().heightPixels);
        Log.d("screen", "xdpi x ydpi: " + r.getDisplayMetrics().xdpi + " x " + r
                .getDisplayMetrics().ydpi);
        Log.d("screen", "screenWidthDp x screenHeightDp: " + r
                .getConfiguration().screenWidthDp + " x " + r.getConfiguration().screenHeightDp);
        Log.d("screen", "smallestScreenWidthDp: " + r.getConfiguration().smallestScreenWidthDp);
        UiModeManager uiModeManager = (UiModeManager) context
                .getSystemService(context.UI_MODE_SERVICE);
        Log.d("screen", "UIMode:" + uiModeManager
                .getCurrentModeType() + "  1= normal, 2=desk, 3=car, 4=TV, 5=appliance, 6=Watch");
        Log.d("screen", "deviceType: " + getDeviceType(context));

    }

    public static int getSmallestDeviceWidth (Resources r)
    {
        return r.getConfiguration().smallestScreenWidthDp;
    }

    public static int getSmallestDeviceWidthInPx (Resources r)
    {
        return r.getConfiguration().smallestScreenWidthDp * (int) r.getDisplayMetrics().density;
    }


    public static boolean canAnimateTransition ()
    {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

    public static int getPxForDp (Resources r, int dp)
    {
        return (int) TypedValue
                .applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
    }


}
