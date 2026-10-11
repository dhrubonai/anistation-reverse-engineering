package defpackage;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sk2 {
    public static final ts4 b = new ts4("fire-global");
    public static final ts4 c = new ts4("fire-count");
    public static final ts4 d = new ts4("last-used-date");
    public final a43 a;

    public sk2(Context context, String str) {
        this.a = new a43(context, "FirebaseHeartBeat".concat(str));
    }

    public static String b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static ts4 c(j44 j44Var, String str) {
        for (Map.Entry entry : j44Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((ts4) entry.getKey()).a;
                        str2.getClass();
                        return new ts4(str2);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String b2 = b(System.currentTimeMillis());
            vz0 vz0Var = null;
            for (Map.Entry entry : ((Map) bx7.K(it1.x, new hu1(this.a, vz0Var, (byte) 13))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(b2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new zx(((ts4) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }
}
