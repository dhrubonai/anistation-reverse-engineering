package x4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import s4.g;

/* loaded from: classes.dex */
public abstract class a extends l {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        g gVar = new g(1);
        zzb = gVar;
        zzc = new i("SmsRetriever.API", gVar, hVar);
    }

    public a(Activity activity) {
        super(activity, zzc, (e) e.f2365i, k.f2487c);
    }

    public a(Context context) {
        super(context, zzc, e.f2365i, k.f2487c);
    }
}
