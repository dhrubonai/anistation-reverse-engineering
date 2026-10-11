package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzajs extends zzajt {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private static <E> List<E> zzc(Object obj, long j4) {
        return (List) zzamh.zze(obj, j4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
    public final <L> List<L> zza(Object obj, long j4) {
        return zza(obj, j4, 10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
    public final void zzb(Object obj, long j4) {
        Object unmodifiableList;
        List list = (List) zzamh.zze(obj, j4);
        if (list instanceof zzajq) {
            unmodifiableList = ((zzajq) list).a_();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzakw) && (list instanceof zzajg)) {
                zzajg zzajgVar = (zzajg) list;
                if (zzajgVar.zzc()) {
                    zzajgVar.b_();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzamh.zza(obj, j4, unmodifiableList);
    }

    private zzajs() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j4, int i10) {
        zzajr zzajrVar;
        List<L> arrayList;
        List<L> zzc = zzc(obj, j4);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzajq) {
                arrayList = new zzajr(i10);
            } else if ((zzc instanceof zzakw) && (zzc instanceof zzajg)) {
                arrayList = ((zzajg) zzc).zza(i10);
            } else {
                arrayList = new ArrayList<>(i10);
            }
            zzamh.zza(obj, j4, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i10);
            arrayList2.addAll(zzc);
            zzamh.zza(obj, j4, arrayList2);
            zzajrVar = arrayList2;
        } else if (zzc instanceof zzamg) {
            zzajr zzajrVar2 = new zzajr(zzc.size() + i10);
            zzajrVar2.addAll((zzamg) zzc);
            zzamh.zza(obj, j4, zzajrVar2);
            zzajrVar = zzajrVar2;
        } else {
            if (!(zzc instanceof zzakw) || !(zzc instanceof zzajg)) {
                return zzc;
            }
            zzajg zzajgVar = (zzajg) zzc;
            if (zzajgVar.zzc()) {
                return zzc;
            }
            zzajg zza2 = zzajgVar.zza(zzc.size() + i10);
            zzamh.zza(obj, j4, zza2);
            return zza2;
        }
        return zzajrVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajt
    public final <E> void zza(Object obj, Object obj2, long j4) {
        List zzc = zzc(obj2, j4);
        List zza2 = zza(obj, j4, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzamh.zza(obj, j4, zzc);
    }
}
