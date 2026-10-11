package n1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f7942a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7943b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7944c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7945d;

    public h(String str, long j4, ArrayList arrayList, List list) {
        this.f7942a = str;
        this.f7943b = j4;
        this.f7944c = Collections.unmodifiableList(arrayList);
        this.f7945d = Collections.unmodifiableList(list);
    }
}
