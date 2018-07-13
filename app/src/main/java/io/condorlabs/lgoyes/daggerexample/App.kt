package io.condorlabs.lgoyes.daggerexample

import android.app.Application

/**
 * Application object where dagger will live throughout the
 * entire life span of the application
 *
 * Instances should be declared only once
 *
 * Create private instance of appllication component
 *
 * OnCreate method where the component will be instantiated by
 * Dagger
 *
 * XXX AS WE ARE OVERRIDING THE DEFAULT APPLICATION CLASS
 * WE ALSO NEED TO MODIFY THE APPLICATION NAME TO LUNCH
 * THE APP
 */
class App : Application() {
    private lateinit var component : ApplicationComponent

    /**
     * Here we define every module we have in our app
     */
    override fun onCreate() {
        super.onCreate()
        component =
                DaggerApplicationComponent.builder()
                        .applicationModule( ApplicationModule(this) )
                        .build()
    }

    fun getComponent() : ApplicationComponent = component
}