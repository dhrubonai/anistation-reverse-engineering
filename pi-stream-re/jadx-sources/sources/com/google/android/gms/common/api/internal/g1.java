package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g1 extends androidx.fragment.app.y implements l {

    /* renamed from: p0, reason: collision with root package name */
    public static final WeakHashMap f2416p0 = new WeakHashMap();

    /* renamed from: m0, reason: collision with root package name */
    public final Map f2417m0 = Collections.synchronizedMap(new n.e());

    /* renamed from: n0, reason: collision with root package name */
    public int f2418n0 = 0;

    /* renamed from: o0, reason: collision with root package name */
    public Bundle f2419o0;

    @Override // androidx.fragment.app.y
    public final void E() {
        this.T = true;
        this.f2418n0 = 3;
        Iterator it = this.f2417m0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.y
    public final void F(Bundle bundle) {
        for (Map.Entry entry : this.f2417m0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.y
    public final void G() {
        this.T = true;
        this.f2418n0 = 2;
        Iterator it = this.f2417m0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.y
    public final void H() {
        this.T = true;
        this.f2418n0 = 4;
        Iterator it = this.f2417m0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f2417m0;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.f2418n0 > 0) {
                new zzi(Looper.getMainLooper()).post(new d0.a(this, lifecycleCallback, str, 6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(r.f.e("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final LifecycleCallback c(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f2417m0.get(str));
    }

    @Override // androidx.fragment.app.y
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f2417m0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.y
    public final void u(int i10, int i11, Intent intent) {
        super.u(i10, i11, intent);
        Iterator it = this.f2417m0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        Bundle bundle2;
        super.x(bundle);
        this.f2418n0 = 1;
        this.f2419o0 = bundle;
        for (Map.Entry entry : this.f2417m0.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    @Override // androidx.fragment.app.y
    public final void z() {
        this.T = true;
        this.f2418n0 = 5;
        Iterator it = this.f2417m0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }
}
