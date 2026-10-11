package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.bumptech.glide.c;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return c.L(LibraryVersionComponent.create(LoggingKt.LIBRARY_NAME, com.google.firebase.BuildConfig.VERSION_NAME));
    }
}
