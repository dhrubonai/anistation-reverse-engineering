package com.google.android.recaptcha.internal;

import a7.a;
import androidx.lifecycle.q0;
import b7.h;
import h7.p;
import i7.d;
import i7.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import o7.j;
import p7.a1;
import p7.y;
import r6.h0;
import w6.f;
import z6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzby extends h implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzcj zzb;
    final /* synthetic */ zzca zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(Exception exc, zzcj zzcjVar, zzca zzcaVar, e eVar) {
        super(eVar);
        this.zza = exc;
        this.zzb = zzcjVar;
        this.zzc = zzcaVar;
    }

    @Override // b7.a
    public final e create(Object obj, e eVar) {
        zzby zzbyVar = new zzby(this.zza, this.zzb, this.zzc, eVar);
        zzbyVar.zzd = obj;
        return zzbyVar;
    }

    @Override // h7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzby) create((y) obj, (e) obj2)).invokeSuspend(f.f11019a);
    }

    @Override // b7.a
    public final Object invokeSuspend(Object obj) {
        zzpg zzpgVar;
        String str;
        a aVar = a.f156a;
        h0.V0(obj);
        y yVar = (y) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzae) {
            zzpgVar = ((zzae) exc).zza();
            zzpgVar.zzd(this.zzb.zza());
        } else {
            zzcj zzcjVar = this.zzb;
            zzpg zzf = zzph.zzf();
            zzf.zzd(zzcjVar.zza());
            zzf.zzp(2);
            zzf.zze(2);
            zzpgVar = zzf;
        }
        zzph zzphVar = (zzph) zzpgVar.zzj();
        zzphVar.zzk();
        zzphVar.zzj();
        Class<?> cls = this.zza.getClass();
        l.f5413a.getClass();
        Class cls2 = new d(cls).f5407a;
        h0.u(cls2, "jClass");
        boolean z9 = true;
        if (!cls2.isAnonymousClass()) {
            if (cls2.isLocalClass()) {
                String simpleName = cls2.getSimpleName();
                Method enclosingMethod = cls2.getEnclosingMethod();
                if (enclosingMethod != null) {
                    j.E1(simpleName, enclosingMethod.getName() + '$');
                } else {
                    Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        j.E1(simpleName, enclosingConstructor.getName() + '$');
                    } else {
                        int p12 = j.p1(simpleName, '$', 0, false, 6);
                        if (p12 != -1) {
                            h0.s(simpleName.substring(p12 + 1, simpleName.length()), "substring(...)");
                        }
                    }
                }
            } else {
                boolean isArray = cls2.isArray();
                LinkedHashMap linkedHashMap = d.f5406c;
                if (isArray) {
                    Class<?> componentType = cls2.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                        str.concat("Array");
                    }
                }
            }
        }
        this.zza.getMessage();
        zzcj zzcjVar2 = this.zzb;
        zzz zzb = zzcjVar2.zzb();
        zzz zzzVar = zzcjVar2.zza;
        if (zzzVar == null) {
            zzzVar = null;
        }
        zzno zza = zzbp.zza(zzb, zzzVar);
        String zzd = this.zzb.zzd();
        if (zzd.length() == 0) {
            zzd = "recaptcha.m.Main.rge";
        }
        a1 a1Var = (a1) yVar.b().r(q0.f1134x);
        if (a1Var != null) {
            z9 = a1Var.a();
        }
        if (z9) {
            zzca zzcaVar = this.zzc;
            zzfy zzh = zzfy.zzh();
            byte[] zzd2 = zzphVar.zzd();
            String zzi = zzh.zzi(zzd2, 0, zzd2.length);
            zzfy zzh2 = zzfy.zzh();
            byte[] zzd3 = zza.zzd();
            zzcaVar.zzc.zze().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return f.f11019a;
    }
}
