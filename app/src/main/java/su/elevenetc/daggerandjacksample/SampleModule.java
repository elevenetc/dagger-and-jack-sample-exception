package su.elevenetc.daggerandjacksample;

import javax.inject.Singleton;

import dagger.Module;

/**
 * Created by eugene.levenetc on 17/01/2017.
 */

@Module
public class SampleModule {
    @Singleton
    public TestObject provideTestObject() {
        return new TestObject();
    }
}
