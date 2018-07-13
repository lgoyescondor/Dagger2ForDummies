package io.condorlabs.lgoyes.daggerexample

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * This is where dagger will keep track of the dependencies
 * @Module so dagger knows it is a module
 * Dagger will look for variables, methods and possible instance
 * providers
 *
 * We will create a module for every feature
 *
 * Methods that return something should also be annotated with
 * @Provides decorator
 *
 * @Singleton signals to the Dagger compiler that the instance
 * should be created only once in the application
 */
@Module
class ApplicationModule(
        var application : Application
) {

    @Provides
    @Singleton
    fun provideContext() : Context = application

}