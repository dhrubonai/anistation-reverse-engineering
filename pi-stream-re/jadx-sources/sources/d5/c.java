package d5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.base.zad;

/* loaded from: classes.dex */
public final class c extends k {

    /* renamed from: a, reason: collision with root package name */
    public final v f3231a;

    public c(Context context, Looper looper, h hVar, v vVar, g gVar, p pVar) {
        super(context, looper, 270, hVar, gVar, pVar);
        this.f3231a = vVar;
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final b5.c[] getApiFeatures() {
        return zad.zab;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        v vVar = this.f3231a;
        vVar.getClass();
        Bundle bundle = new Bundle();
        String str = vVar.f2603a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
