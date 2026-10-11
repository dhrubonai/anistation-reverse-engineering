package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o7.j;
import r6.h0;

/* loaded from: classes.dex */
public final class zzfb {
    public static final zzfb zza = new zzfb();
    private static final List zzb = zze(c.M("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));

    private zzfb() {
    }

    public static final boolean zza(Uri uri) {
        if (zzd(uri) && zzc(uri.toString())) {
            return true;
        }
        return false;
    }

    public static final boolean zzb(Uri uri) {
        return zzd(uri);
    }

    private static final boolean zzc(String str) {
        List list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (j.C1(str, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzd(Uri uri) {
        if (!TextUtils.isEmpty(uri.toString()) && h0.g("https", uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
            return true;
        }
        return false;
    }

    private static final List zze(List list) {
        ArrayList arrayList = new ArrayList(x6.j.o0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}
