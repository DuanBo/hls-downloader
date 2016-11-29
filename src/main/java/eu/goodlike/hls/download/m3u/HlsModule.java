package eu.goodlike.hls.download.m3u;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public final class HlsModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new FactoryModuleBuilder()
                .implement(DownloadableMediaPlaylist.class, MediaPlaylist.class)
                .build(MediaPlaylistFactory.class));
    }

}
