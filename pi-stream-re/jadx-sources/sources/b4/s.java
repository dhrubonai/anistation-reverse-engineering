package b4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s implements p {

    /* renamed from: b, reason: collision with root package name */
    public final Map f1490b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map f1491c;

    public s(Map map) {
        this.f1490b = Collections.unmodifiableMap(map);
    }

    @Override // b4.p
    public final Map a() {
        if (this.f1491c == null) {
            synchronized (this) {
                if (this.f1491c == null) {
                    this.f1491c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f1491c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f1490b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = ((r) list.get(i10)).f1489a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i10 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f1490b.equals(((s) obj).f1490b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1490b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f1490b + '}';
    }
}
