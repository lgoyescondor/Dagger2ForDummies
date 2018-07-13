package io.condorlabs.lgoyes.daggerexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.Component
import dagger.Module
import dagger.Provides
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerExampleComponent.create().inject( this )

        tvMainHelloworld?.text = info.text
    }


}

class Info (val text : String)

@Component(modules = [ExampleModule::class])
interface ExampleComponent {
    fun inject( app : MainActivity )
}

@Module
class ExampleModule {
    @Provides
    fun providesInfo() : Info {
        return Info("Love Dagger 2")
    }
}