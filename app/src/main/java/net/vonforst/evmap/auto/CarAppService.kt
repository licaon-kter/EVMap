package net.vonforst.evmap.auto

import android.content.Intent
import com.google.android.libraries.car.app.CarContext
import com.google.android.libraries.car.app.Screen
import com.google.android.libraries.car.app.model.Pane
import com.google.android.libraries.car.app.model.PaneTemplate
import com.google.android.libraries.car.app.model.Row
import com.google.android.libraries.car.app.model.Template


class CarAppService : com.google.android.libraries.car.app.CarAppService() {
    override fun onCreateScreen(intent: Intent): Screen {
        return HelloWorldScreen(carContext)
    }
}

class HelloWorldScreen(ctx: CarContext) : Screen(ctx) {
    override fun getTemplate(): Template {
        val pane: Pane = Pane.builder()
            .addRow(
                Row.builder()
                    .setTitle("Hello world!")
                    .build()
            )
            .build()
        return PaneTemplate.builder(pane)
            .setTitle("EVMap")
            .build()
    }
}