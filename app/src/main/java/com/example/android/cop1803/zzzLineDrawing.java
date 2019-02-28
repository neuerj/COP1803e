package com.example.android.cop1803;

/*import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.List;

public class LineDrawing {
    MainActivity mMainActivit = new MainActivity();
    public void drawLines(List<LineView> mlinesToDraw, View view, HashMap vars, String
            btnprefix, int startIndex1, int endIndex1, int startIndex2, int endIndex2) {


        String btn1, btn11, btn2, btn22;

        int mStartX = -1;
        int mStartY = -1;
        int mXOffset = -1;
        int mYOffset = -1;
        final int[] mCoords = new int[2];

        for (int i = 0; i < mlinesToDraw.size(); i++) {

            int lineID = mlinesToDraw.get(i).getId();
            String linename =view.getResources().getResourceEntryName(lineID);
            btn1 = linename.substring(startIndex1, endIndex1);
            btn2 = linename.substring(startIndex2, endIndex2);

            btn11 = btnprefix + btn1;
            Button vBtn1 = (Button) vars.get(btn11);
            btn22 = btnprefix + btn2;
            Button vBtn2 = (Button) vars.get(btn22);

            //int statusbarheight=mMainActivit.getstatusBarHeight();
            int statusbarheight=0;

            int buttonID=vBtn1.getId();
            Button btn=view.getRootView().findViewById(buttonID);
            btn.getLocationOnScreen(mCoords);
           //vBtn1.getLocationOnScreen(mCoords);
          //  mStartX = mCoords[0] + vBtn1.getWidth() / 2;
            //mStartY = mCoords[1] - statusbarheight + (vBtn1.getHeight()) / 2 ;
            mStartX = mCoords[0] + btn.getWidth() / 2;
            mStartY = mCoords[1] - statusbarheight + (btn.getHeight()) / 2 ;


            int buttonID222=vBtn1.getId();
            Button btn222=view.getRootView().findViewById(buttonID222);
            btn222.getLocationOnScreen(mCoords);
           // vBtn2.getLocationOnScreen(mCoords);
        //    int endX = mCoords[0] + vBtn2.getWidth() / 2;
         //   int endY = mCoords[1] - statusbarheight + (vBtn2.getHeight() / 2);
            int endX = mCoords[0] + btn222.getWidth() / 2;
            int endY = mCoords[1] - statusbarheight + (btn222.getHeight() / 2);
            //line.setCoords(mStartX, mStartY, endX, endY);
            mlinesToDraw.get(i).setCoords(mStartX, mStartY, endX, endY);
            // mLine.get(i).setPointA(pointA);
            //mLine.get(i).setPointB(pointB);
            //
        }

    }
}*/
