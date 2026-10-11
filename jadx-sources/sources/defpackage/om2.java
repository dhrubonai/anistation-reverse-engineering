package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class om2 {
    public final nm2 a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public om2(nm2 nm2Var, String str, Uri uri, int i) {
        this.a = nm2Var;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final zw2 a() {
        return zw2.m(this.b.keySet());
    }

    public final Uri b() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
