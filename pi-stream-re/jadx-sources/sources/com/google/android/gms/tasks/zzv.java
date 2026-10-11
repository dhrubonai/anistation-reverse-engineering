package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzv extends LifecycleCallback {
    private final List zza;

    private zzv(l lVar) {
        super(lVar);
        this.zza = new ArrayList();
        this.mLifecycleFragment.a("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        l fragment = LifecycleCallback.getFragment(activity);
        zzv zzvVar = (zzv) fragment.c(zzv.class, "TaskOnStopCallback");
        if (zzvVar == null) {
            return new zzv(fragment);
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.zza) {
            Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                if (zzqVar != null) {
                    zzqVar.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzqVar));
        }
    }
}
