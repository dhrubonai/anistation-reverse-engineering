package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l7.b;
import l7.c;
import o7.j;
import r6.h0;
import x6.m;

/* loaded from: classes.dex */
public final class zzy implements zzh {
    private final Context zza;
    private final String zzb = "rce_";
    private final zzad zzc;

    public zzy(Context context) {
        this.zza = context;
        this.zzc = new zzad(context);
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzad.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (j.C1(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final void zzc(String str, String str2) {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(x6.j.o0(cVar));
        Iterator it = cVar.iterator();
        while (((b) it).f6880c) {
            b bVar = (b) it;
            int i10 = bVar.f6881d;
            if (i10 == bVar.f6879b) {
                if (bVar.f6880c) {
                    bVar.f6880c = false;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                bVar.f6881d = bVar.f6878a + i10;
            }
            arrayList.add(Character.valueOf((char) i10));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.shuffle(arrayList2);
        String r02 = m.r0(arrayList2.subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(r02));
        zzad.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    File file2 = listFiles[i10];
                    if (h0.g(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i10++;
                }
            }
            if (file == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
