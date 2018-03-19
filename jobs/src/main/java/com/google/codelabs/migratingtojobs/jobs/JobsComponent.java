package com.google.codelabs.migratingtojobs.jobs;


import com.google.codelabs.migratingtojobs.shared.AppModule;
import com.google.codelabs.migratingtojobs.shared.RootComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * While it can be tempting to put logic inside the JobService, that's a trap.
 * Keep your JobService as short as possible and offload the work to
 * other parts of your app that are more easily tested and replaced.
 */
@Singleton
@Component(modules = {AppModule.class, JobsModule.class})
public interface JobsComponent extends RootComponent{
    public void inject(JobsGlobalState globalState);
    public void inject(JobsCatalogListActivity activity);
    public void inject(DownloaderJobService jobService);
}
