package mx.tec.tareas

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/** Quién construye a quién, en un solo lugar. Como el de las prácticas 5 a 8. */

@HiltAndroidApp
class MiApp : Application()