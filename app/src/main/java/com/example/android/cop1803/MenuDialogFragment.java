package com.example.android.cop1803;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MenuDialogFragment extends AppCompatDialogFragment {
    //String[] tvshows={"Crisis","Blindspot","BlackList","Game of Thrones","Gotham","Banshee"};
    RecyclerView rv;
    private RecyclerView mRecyclerView;
    public static CartListAdapter mAdapter;
    public static ArrayList<Item> cartList = new ArrayList<Item>();
    Globals g =Globals.getInstance();
    MainActivity mMainActivit = new MainActivity();
    public static final String LOG_TAG="";
    File pdfFolder;
    private String path;
    View view;
    Bitmap b;
    Button btnPDF,btnback;



    public MenuDialogFragment() throws FileNotFoundException {
        // Required empty public constructor
    }

    public static MenuDialogFragment newInstance() throws FileNotFoundException {
        return new MenuDialogFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setStyle(DialogFragment.STYLE_NORMAL,R.style.CustomDialog);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.recyclerview_menu, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_menuview);
        btnPDF=view.findViewById(R.id.SharePDF);
        btnback=view.findViewById(R.id.MainCOPbackbtn);
        //btnPDF.setOnClickListener((View.OnClickListener) getContext()); // calling onClick()
        // method
        btnPDF.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                takeScreenShot();
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MenuDialogFragment.this.dismiss();
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle args = getArguments();
        if(args != null) {
            cartList = args.getParcelableArrayList("key");
            //cartList.remove(0);
        MenuDialogFragmentAdapter adapter = new MenuDialogFragmentAdapter(this.getActivity(), cartList);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(),
        DividerItemDecoration.VERTICAL));


       }
    }
    @Override
    public void onResume() {
        // Get existing layout params for the window
        ViewGroup.LayoutParams params = getDialog().getWindow().getAttributes();
        // Assign window properties to fill the parent
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = WindowManager.LayoutParams.MATCH_PARENT;
        getDialog().getWindow().setAttributes((android.view.WindowManager.LayoutParams) params);
        // Call super onResume after sizing
        super.onResume();}


        private void takeScreenShot() {
        String signature_pdf_;
        int totalHeight;
        int RecylertotalHeight;
        int totalWidth;
            if (isStoragePermissionGranted()) {
                File folder = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Signature/");

                if (!folder.exists()) {
                    boolean success = folder.mkdir();
                }
                signature_pdf_ = "TCOTP";
                path = folder.getAbsolutePath();
                path = path + "/" + signature_pdf_ + System.currentTimeMillis() + ".pdf";// path where
                // pdf will be stored

                View u= getView().findViewById(R.id.scroll);

                totalHeight = u.getHeight();
                totalWidth = u.getWidth();
                int cnt = mRecyclerView.getChildCount();
                if (cnt > 1) {
                    RecylertotalHeight = mRecyclerView.getChildAt(0).getHeight();// parent view height
                    //totalWidth = mRecyclerView.getChildAt(0).getWidth();// parent view width
                    if(RecylertotalHeight>totalHeight){totalHeight=(totalHeight/2)
                            +RecylertotalHeight;}
                }
                Bitmap b = getBitmapFromView(u, totalHeight, totalWidth);

                //Save bitmap to  below path
                String extr = Environment.getExternalStorageDirectory() + "/Signature/";
                File file = new File(extr);
                if (!file.exists())
                    file.mkdir();
                String fileName = signature_pdf_ + ".jpg";
                //String fileName = "report.jpg";
                File myPath = new File(extr, fileName);
                File imagesUri = new File(myPath.getPath());
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(myPath);
                    b.compress(Bitmap.CompressFormat.JPEG, 100, fos);
                    fos.flush();
                    fos.close();
                    MediaStore.Images.Media.insertImage(getContext().getContentResolver(), b, "Screen", "screen");
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                createPdf(b);// create pdf after creating bitmap and saving
                emailMenu();

            }
        }

    public static Bitmap getBitmapFromView(View view, int totalHeight, int totalWidth) {

       // int height = Math.min(MAX_HEIGHT, totalHeight);
        //float percent = height / (float)totalHeight;

       // Bitmap canvasBitmap = Bitmap.createBitmap((int)(totalWidth*percent),(int)(totalHeight*percent), Bitmap.Config.ARGB_8888);
        Bitmap canvasBitmap = Bitmap.createBitmap((totalWidth),(totalHeight), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(canvasBitmap);

        Drawable bgDrawable = view.getBackground();
        if (bgDrawable != null)
            bgDrawable.draw(canvas);
        else
            canvas.drawColor(Color.WHITE);

        canvas.save();
       // canvas.scale(percent, percent);
        view.draw(canvas);
        canvas.restore();

        return canvasBitmap;
    }

    private void createPdf(Bitmap b) {

        PdfDocument document = new PdfDocument();
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(b.getWidth(), b.getHeight(), 1).create();
        PdfDocument.Page page = document.startPage(pageInfo);

        Canvas canvas = page.getCanvas();
        Paint paint = new Paint();
        //paint.setColor(Color.parseColor("#ffffff"));
        canvas.drawPaint(paint);
        Bitmap bitmap = Bitmap.createScaledBitmap(b, b.getWidth(), b.getHeight(), true);
        //paint.setColor(Color.BLUE);
        canvas.drawBitmap(bitmap, 0, 0, null);
        document.finishPage(page);
        File filePath = new File(path);
        try {
            document.writeTo(new FileOutputStream(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getContext(), "Something wrong: "+e, Toast.LENGTH_LONG).show();
        }
        // close the document
        document.close();
        //openPdf(path);// You can open pdf after complete

    }
    private void viewPdf(){
        Intent intent = new Intent(Intent.ACTION_VIEW);

        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

       Uri apkURI = FileProvider.getUriForFile(getContext(),getString(R.string.file_provider_authority), new File(path));

       // intent.setDataAndType(Uri.fromFile(new File(path)), "application/pdf");
        intent.setDataAndType(apkURI, "application/pdf");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
    }

    private void emailMenu()
    {
        String mSubjectEditText="TCOTP Today's Special";
        String mBodyEditText="";
        File myFile=new File(path);
        Intent email = new Intent(Intent.ACTION_SEND);
        //email.setType("message/rfc822");
        email.setType("application/pdf");
        email.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        email.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        email.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        email.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

        email.putExtra(Intent.EXTRA_SUBJECT,mSubjectEditText);
        email.putExtra(Intent.EXTRA_TEXT, mBodyEditText);

        Uri apkURI = FileProvider.getUriForFile(getContext(),getString(R.string.file_provider_authority), new File(path));
        email.putExtra(Intent.EXTRA_STREAM, apkURI);

        startActivity(Intent.createChooser(email, "Share Menu"));

    }
    public boolean isStoragePermissionGranted() {
        String TAG = "Storage Permission";
        if (Build.VERSION.SDK_INT >= 23) {
            if (ContextCompat.checkSelfPermission(getActivity(),Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v(TAG, "Permission is granted");
                return true;
            } else {
                Log.v(TAG, "Permission is revoked");
                ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission
                        .WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            Log.v(TAG,"Permission is granted");
            return true;
        }
    }



}
/*    private void createPdf(){
        File pdfFolder = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_DOCUMENTS), "pdfdemo");
        if (!pdfFolder.exists()) {
            pdfFolder.mkdir();
            Log.i(LOG_TAG, "Pdf Directory created");
        }
    }
    //Create time stamp
    Date date = new Date() ;
    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(date);

    File myFile = new File(pdfFolder + timeStamp + ".pdf");

    OutputStream output = new FileOutputStream(myFile);
    PdfDocument document = new PdfDocument();*/




/*ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapter);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(mRecyclerView);*/

/*
    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder) {
        mItemTouchHelper.startDrag(viewHolder);
    }
*/




   /* @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.recyclerview_menu,container);

        //RECYCER
        rv= (RecyclerView) rootView.findViewById(R.id.recycler_menuview);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        //ADAPTER
        mAdapter = new CartListAdapter(this.getActivity(), cartList);
       // adapter=new MyAdapter(this.getActivity(),tvshows);
        rv.setAdapter(mAdapter);

        this.getDialog().setTitle("TV Shows");


        return rootView;
    }*/




