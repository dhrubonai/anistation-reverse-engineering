package androidx.media3.cast;

import android.content.Context;
import com.google.android.gms.cast.framework.OptionsProvider;
import defpackage.aa3;
import defpackage.di0;
import defpackage.qi2;
import defpackage.vl7;
import defpackage.zh0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DefaultCastOptionsProvider implements OptionsProvider {
    @Override // com.google.android.gms.cast.framework.OptionsProvider
    public List<vl7> getAdditionalSessionProviders(Context context) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    public di0 getCastOptions(Context context) {
        ArrayList arrayList = new ArrayList();
        aa3 aa3Var = new aa3();
        ArrayList arrayList2 = new ArrayList();
        zh0 zh0Var = di0.R;
        if (zh0Var != null) {
            return new di0("A12D4273", arrayList, true, aa3Var, false, zh0Var, false, 0.05000000074505806d, false, false, true, arrayList2, true, false, di0.P, di0.Q, false, false);
        }
        qi2.m("use Optional.orNull() instead of Optional.or(null)");
        return null;
    }
}
