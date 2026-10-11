package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
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
public final class f1 extends Fragment implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f2399d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Map f2400a = Collections.synchronizedMap(new n.e());

    /* renamed from: b, reason: collision with root package name */
    public int f2401b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2402c;

    @Override // com.google.android.gms.common.api.internal.l
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f2400a;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.f2401b > 0) {
                new zzi(Looper.getMainLooper()).post(new d0.a(this, lifecycleCallback, str, 5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(r.f.e("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final LifecycleCallback c(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f2400a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f2400a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f2400a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f2401b = 1;
        this.f2402c = bundle;
        for (Map.Entry entry : this.f2400a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f2401b = 5;
        Iterator it = this.f2400a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f2401b = 3;
        Iterator it = this.f2400a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f2400a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f2401b = 2;
        Iterator it = this.f2400a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f2401b = 4;
        Iterator it = this.f2400a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
