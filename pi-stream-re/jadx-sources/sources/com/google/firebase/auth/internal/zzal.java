package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzyi;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p7.a0;
import w7.b;

/* loaded from: classes.dex */
public final class zzal extends MultiFactorResolver {
    public static final Parcelable.Creator<zzal> CREATOR = new zzan();
    private final List<PhoneMultiFactorInfo> zza;
    private final zzam zzb;
    private final String zzc;
    private final com.google.firebase.auth.zzd zzd;
    private final zzaf zze;
    private final List<TotpMultiFactorInfo> zzf;

    public zzal(List<PhoneMultiFactorInfo> list, zzam zzamVar, String str, com.google.firebase.auth.zzd zzdVar, zzaf zzafVar, List<TotpMultiFactorInfo> list2) {
        b.s(list);
        this.zza = list;
        b.s(zzamVar);
        this.zzb = zzamVar;
        b.o(str);
        this.zzc = str;
        this.zzd = zzdVar;
        this.zze = zzafVar;
        b.s(list2);
        this.zzf = list2;
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final FirebaseAuth getFirebaseAuth() {
        return FirebaseAuth.getInstance(FirebaseApp.getInstance(this.zzc));
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final List<MultiFactorInfo> getHints() {
        ArrayList arrayList = new ArrayList();
        Iterator<PhoneMultiFactorInfo> it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<TotpMultiFactorInfo> it2 = this.zzf.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final MultiFactorSession getSession() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.MultiFactorResolver
    public final Task<AuthResult> resolveSignIn(MultiFactorAssertion multiFactorAssertion) {
        return getFirebaseAuth().zza(multiFactorAssertion, this.zzb, this.zze).continueWithTask(new zzak(this));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.s0(parcel, 1, this.zza, false);
        a0.m0(parcel, 2, getSession(), i10, false);
        a0.n0(parcel, 3, this.zzc, false);
        a0.m0(parcel, 4, this.zzd, i10, false);
        a0.m0(parcel, 5, this.zze, i10, false);
        a0.s0(parcel, 6, this.zzf, false);
        a0.u0(t02, parcel);
    }

    public static zzal zza(zzyi zzyiVar, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        List<MultiFactorInfo> zzc = zzyiVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : zzc) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        List<MultiFactorInfo> zzc2 = zzyiVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (MultiFactorInfo multiFactorInfo2 : zzc2) {
            if (multiFactorInfo2 instanceof TotpMultiFactorInfo) {
                arrayList2.add((TotpMultiFactorInfo) multiFactorInfo2);
            }
        }
        return new zzal(arrayList, zzam.zza(zzyiVar.zzc(), zzyiVar.zzb()), firebaseAuth.getApp().getName(), zzyiVar.zza(), (zzaf) firebaseUser, arrayList2);
    }
}
