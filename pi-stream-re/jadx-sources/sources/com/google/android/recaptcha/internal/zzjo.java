package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzjo extends zzjs {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzjo(zzjn zzjnVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j4, int i10) {
        zzjl zzjlVar;
        List arrayList;
        List list = (List) zzlv.zzf(obj, j4);
        if (list.isEmpty()) {
            if (list instanceof zzjm) {
                arrayList = new zzjl(i10);
            } else if ((list instanceof zzkm) && (list instanceof zzjb)) {
                arrayList = ((zzjb) list).zzd(i10);
            } else {
                arrayList = new ArrayList(i10);
            }
            zzlv.zzs(obj, j4, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            zzlv.zzs(obj, j4, arrayList2);
            zzjlVar = arrayList2;
        } else if (list instanceof zzlq) {
            zzjl zzjlVar2 = new zzjl(list.size() + i10);
            zzjlVar2.addAll(zzjlVar2.size(), (zzlq) list);
            zzlv.zzs(obj, j4, zzjlVar2);
            zzjlVar = zzjlVar2;
        } else {
            if ((list instanceof zzkm) && (list instanceof zzjb)) {
                zzjb zzjbVar = (zzjb) list;
                if (!zzjbVar.zzc()) {
                    zzjb zzd = zzjbVar.zzd(list.size() + i10);
                    zzlv.zzs(obj, j4, zzd);
                    return zzd;
                }
                return list;
            }
            return list;
        }
        return zzjlVar;
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final List zza(Object obj, long j4) {
        return zzf(obj, j4, 10);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzb(Object obj, long j4) {
        Object unmodifiableList;
        List list = (List) zzlv.zzf(obj, j4);
        if (list instanceof zzjm) {
            unmodifiableList = ((zzjm) list).zze();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if ((list instanceof zzkm) && (list instanceof zzjb)) {
                zzjb zzjbVar = (zzjb) list;
                if (zzjbVar.zzc()) {
                    zzjbVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        zzlv.zzs(obj, j4, unmodifiableList);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzc(Object obj, Object obj2, long j4) {
        List list = (List) zzlv.zzf(obj2, j4);
        List zzf = zzf(obj, j4, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzlv.zzs(obj, j4, list);
    }

    private zzjo() {
        super(null);
    }
}
