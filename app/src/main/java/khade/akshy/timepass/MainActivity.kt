package khade.akshy.timepass

import android.app.Activity
import android.os.AsyncTask
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    internal lateinit var mTcpClient: TcpClient

    internal lateinit var txtMain: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtMain = findViewById(R.id.txtMain)
        ConnectTask().execute("")
    }

    inner class ConnectTask : AsyncTask<String, String, TcpClient>() {

        override fun doInBackground(vararg message: String): TcpClient? {

            //we create a TCPClient object and
            mTcpClient = TcpClient("192.168.1.187", 8181, TcpClient.OnMessageReceived { message ->
                publishProgress(message)
            })
            mTcpClient.run()

            return null
        }

        override fun onProgressUpdate(vararg values: String) {
            super.onProgressUpdate(*values)

            txtMain.append(values[0])
        }
    }
}
