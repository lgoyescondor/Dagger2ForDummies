package io.condorlabs.lgoyes.daggerexample

import dagger.Component
import javax.inject.Singleton

/**
 * Informs Dagger where the dependencies should inject to.
 *
 * Assigns references in our activities, services or fragments
 * to have access to singleton already defined in the module
 *
 * Activities, services or fragments that can be added should
 * be declared in this class with individual inject methods
 */
@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject( target : MainActivity )
}