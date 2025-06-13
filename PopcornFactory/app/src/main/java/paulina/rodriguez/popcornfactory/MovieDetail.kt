package paulina.rodriguez.popcornfactory

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie_detail)


        var infoPelicula = intent.extras

        if (infoPelicula != null) {
            findViewById<android.widget.ImageView>(R.id.iv_pelicula_imagen).setImageResource(infoPelicula.getInt("header"))
            findViewById<android.widget.TextView>(R.id.tv_nombre_pelicula).setText(infoPelicula.getString("titulo"))
            findViewById<android.widget.TextView>(R.id.tv_pelicula_desc).setText(infoPelicula.getString("sinopsis"))

            findViewById<TextView>(R.id.tv_pelicula_desc).movementMethod = android.text.method.ScrollingMovementMethod()

        }
    }
}