package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import n7.d;
import p7.y;
import r6.h0;
import x6.n;
import x6.t;

/* loaded from: classes.dex */
public final class zzbm implements zzbh {
    public static final zzbi zza = new zzbi(null);
    private static Timer zzb;
    private final zzbn zzc;
    private final y zzd;
    private final zzaz zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbm(Context context, zzbn zzbnVar, y yVar) {
        this.zzc = zzbnVar;
        this.zzd = yVar;
        zzaz zzazVar = null;
        Object[] objArr = 0;
        try {
            zzaz zzc = zzaz.zzc();
            zzc = zzc == null ? new zzaz(context, objArr == true ? 1 : 0) : zzc;
            zzaz.zze(zzc);
            zzazVar = zzc;
        } catch (Exception unused) {
        }
        this.zze = zzazVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList<List> arrayList;
        Iterator it;
        zzaz zzazVar;
        zzpd zzk;
        int zzJ;
        int i10;
        int i11;
        boolean z9;
        zzaz zzazVar2 = this.zze;
        if (zzazVar2 != null) {
            List zzd = zzazVar2.zzd();
            h0.u(zzd, "<this>");
            if (zzd instanceof RandomAccess) {
                int size = zzd.size();
                int i12 = size / 20;
                if (size % 20 == 0) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                arrayList = new ArrayList(i12 + i11);
                int i13 = 0;
                while (true) {
                    if (i13 >= 0 && i13 < size) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        break;
                    }
                    int i14 = size - i13;
                    if (20 <= i14) {
                        i14 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i14);
                    for (int i15 = 0; i15 < i14; i15++) {
                        arrayList2.add(zzd.get(i15 + i13));
                    }
                    arrayList.add(arrayList2);
                    i13 += 20;
                }
            } else {
                arrayList = new ArrayList();
                Iterator it2 = zzd.iterator();
                h0.u(it2, "iterator");
                if (!it2.hasNext()) {
                    it = n.f11317a;
                } else {
                    t tVar = new t(20, 20, it2, false, true, null);
                    d dVar = new d();
                    dVar.f8017d = com.bumptech.glide.d.o(dVar, dVar, tVar);
                    it = dVar;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            for (List<zzba> list : arrayList) {
                zznh zzi = zzni.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzba zzbaVar : list) {
                    try {
                        zzk = zzpd.zzk(zzfy.zzg().zzj(zzbaVar.zzc()));
                        zzJ = zzk.zzJ();
                        i10 = zzJ - 1;
                    } catch (Exception unused) {
                        zzaz zzazVar3 = this.zze;
                        if (zzazVar3 != null) {
                            zzazVar3.zzf(zzbaVar);
                        }
                    }
                    if (zzJ != 0) {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                zzi.zzq(zzk.zzg());
                            }
                        } else {
                            zzi.zzp(zzk.zzf());
                        }
                        arrayList3.add(zzbaVar);
                    } else {
                        throw null;
                    }
                }
                if (zzi.zze() + zzi.zzd() != 0) {
                    if (this.zzc.zza(((zzni) zzi.zzj()).zzd()) && (zzazVar = this.zze) != null) {
                        zzazVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzbj(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbh
    public final void zza(zzpd zzpdVar) {
        h0.k0(this.zzd, new zzbl(this, zzpdVar, null));
        zzh();
    }
}
