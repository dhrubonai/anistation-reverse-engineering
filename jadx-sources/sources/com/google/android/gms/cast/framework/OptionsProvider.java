package com.google.android.gms.cast.framework;

import android.content.Context;
import defpackage.di0;
import defpackage.vl7;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface OptionsProvider {
    List<vl7> getAdditionalSessionProviders(Context context);

    di0 getCastOptions(Context context);
}
