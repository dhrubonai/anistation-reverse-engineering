package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bn4 {
    public final l11 a;
    public final Context b;
    public final wg5 c;
    public final fk3 d;
    public TextClassifier f;
    public final m54 e = new m54();
    public final ti4 g = xt5.g(null);
    public final Object h = new Object();

    public bn4(l11 l11Var, Context context, wg5 wg5Var, fk3 fk3Var) {
        this.a = l11Var;
        this.b = context;
        this.c = wg5Var;
        this.d = fk3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r6v3, types: [k54] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.xz0 r21) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn4.a(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, xz0):java.lang.Object");
    }

    public final l86 b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction remoteAction2 = remoteAction;
            Drawable drawable = null;
            if (i != 0 && !remoteAction2.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction remoteAction3 = remoteAction;
            if (remoteAction3 != null && (icon = remoteAction3.getIcon()) != null) {
                drawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawable);
        }
        return new l86(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList c() {
        fk3 fk3Var = this.d;
        if (fk3Var != null) {
            ArrayList arrayList = new ArrayList(zo0.V(fk3Var, 10));
            Iterator it = fk3Var.x.iterator();
            while (it.hasNext()) {
                arrayList.add(((ek3) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        return new LocaleList(((ek3) om4.a.r().x.get(0)).a);
    }

    public final Object d(CharSequence charSequence, long j, t36 t36Var) {
        if (charSequence.length() == 0 || nd6.d(j)) {
            return pn6.a;
        }
        return tl7.V(this.a, new j10(this, new q02((Object) this, (Object) charSequence, j, (vz0) null, (byte) 1), null, (byte) 5), t36Var);
    }
}
