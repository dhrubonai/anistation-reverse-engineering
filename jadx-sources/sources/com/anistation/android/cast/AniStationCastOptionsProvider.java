package com.anistation.android.cast;

import android.content.Context;
import com.anistation.android.MainActivity;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import defpackage.aa3;
import defpackage.di0;
import defpackage.nb4;
import defpackage.nt1;
import defpackage.ob4;
import defpackage.qi2;
import defpackage.qx1;
import defpackage.te4;
import defpackage.vl7;
import defpackage.ze0;
import defpackage.zh0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AniStationCastOptionsProvider implements OptionsProvider {
    public static final int $stable = 0;

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    public List<vl7> getAdditionalSessionProviders(Context context) {
        context.getClass();
        return nt1.x;
    }

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    public di0 getCastOptions(Context context) {
        context.getClass();
        nb4 nb4Var = new nb4();
        List H = te4.H(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
        int[] iArr = {0};
        int size = H.size();
        if (1 <= size) {
            int i = iArr[0];
            if (i >= 0 && i < size) {
                nb4Var.a = new ArrayList(H);
                nb4Var.b = Arrays.copyOf(iArr, 1);
                ob4 a = nb4Var.a();
                new nb4().a();
                zh0 zh0Var = new zh0("com.google.android.gms.cast.framework.media.MediaIntentReceiver", MainActivity.class.getName(), null, a, false, true);
                ArrayList arrayList = new ArrayList();
                aa3 aa3Var = new aa3();
                ArrayList arrayList2 = new ArrayList();
                if (di0.R != null) {
                    return new di0("A12D4273", arrayList, true, aa3Var, false, zh0Var, false, 0.05000000074505806d, false, false, true, arrayList2, true, false, di0.P, di0.Q, false, false);
                }
                qi2.m("use Optional.orNull() instead of Optional.or(null)");
                return null;
            }
            Locale locale = Locale.ROOT;
            ze0.k(qx1.l("Index ", i, " in compatActionIndices out of range: [0, ", size - 1, "]"));
            return null;
        }
        Locale locale2 = Locale.ROOT;
        ze0.k(qx1.i(size, "Invalid number of compat actions: 1 > ", "."));
        return null;
    }
}
