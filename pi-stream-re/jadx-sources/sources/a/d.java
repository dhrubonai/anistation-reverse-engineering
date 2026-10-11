package a;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import androidx.activity.f;
import androidx.fragment.app.o;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f.p0;
import java.util.ArrayList;
import java.util.List;
import q0.j;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6d;

    public /* synthetic */ d(Object obj, int i10, Object obj2, int i11) {
        this.f3a = i11;
        this.f6d = obj;
        this.f4b = i10;
        this.f5c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        c.b bVar;
        int i10 = this.f3a;
        int i11 = 0;
        Object obj = this.f6d;
        int i12 = this.f4b;
        Object obj2 = this.f5c;
        switch (i10) {
            case 0:
                ((e) obj).d(i12, (Bundle) obj2);
                return;
            case 1:
                f fVar = (f) obj;
                Object obj3 = ((o) obj2).f947a;
                String str = (String) fVar.f1587b.get(Integer.valueOf(i12));
                if (str != null) {
                    c.f fVar2 = (c.f) fVar.f1591f.get(str);
                    if (fVar2 != null && (bVar = fVar2.f1582a) != null) {
                        if (fVar.f1590e.remove(str)) {
                            bVar.a(obj3);
                            return;
                        }
                        return;
                    } else {
                        fVar.f1593h.remove(str);
                        fVar.f1592g.put(str, obj3);
                        return;
                    }
                }
                return;
            case 2:
                ((f) obj).a(i12, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                return;
            case 3:
                String[] strArr = (String[]) obj2;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i11 < length) {
                    iArr[i11] = packageManager.checkPermission(strArr[i11], packageName);
                    i11++;
                }
                ((w.d) activity).onRequestPermissionsResult(i12, strArr, iArr);
                return;
            case 4:
                z7.c cVar = (z7.c) ((p0) obj2).f3762b;
                if (cVar != null) {
                    cVar.q(i12);
                    return;
                }
                return;
            case 5:
                List list = (List) obj2;
                int size = list.size();
                if (i12 != 1) {
                    while (i11 < size) {
                        ((j) list.get(i11)).getClass();
                        i11++;
                    }
                    return;
                } else {
                    while (i11 < size) {
                        ((j) list.get(i11)).a();
                        i11++;
                    }
                    return;
                }
            default:
                ((BottomSheetBehavior) obj).C((View) obj2, i12, false);
                return;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10, int i11) {
        this.f3a = i11;
        this.f6d = obj;
        this.f5c = obj2;
        this.f4b = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(q0.j r3, int r4) {
        /*
            r2 = this;
            r0 = 5
            r2.f3a = r0
            r0 = 1
            q0.j[] r0 = new q0.j[r0]
            if (r3 == 0) goto L14
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
        L14:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "initCallback cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.<init>(q0.j, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i10, ArrayList arrayList) {
        this(arrayList, i10, null);
        this.f3a = 5;
    }

    public d(List list, int i10, Throwable th) {
        this.f3a = 5;
        if (list != null) {
            this.f5c = new ArrayList(list);
            this.f4b = i10;
            this.f6d = th;
            return;
        }
        throw new NullPointerException("initCallbacks cannot be null");
    }
}
