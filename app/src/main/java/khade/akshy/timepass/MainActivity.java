//package khade.akshy.timepass;
//
//import android.app.Activity;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.widget.TextView;
//
//public class MainActivity extends Activity {
//TcpClient mTcpClient ;
//TextView txtMain;
//    public MainActivity()  {
//
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        txtMain = findViewById(R.id.txtMain);
//        new ConnectTask().execute("");
//    }
//
//    public class ConnectTask extends AsyncTask<String, String, TcpClient> {
//
//        @Override
//        protected TcpClient doInBackground(String... message) {
//
//            //we create a TCPClient object and
//            mTcpClient = new TcpClient("192.168.1.187", 8181, new TcpClient.OnMessageReceived() {
//                @Override
//                public void messageReceived(String message) {
//                    publishProgress(message);
//                }
//            });
//            mTcpClient.run();
//
//            return null;
//        }
//
//        @Override
//        protected void onProgressUpdate(String... values) {
//            super.onProgressUpdate(values);
//
//            txtMain.append(values[0]);
//        }
//    }
//}
