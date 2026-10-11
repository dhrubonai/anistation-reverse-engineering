package n1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f7898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7899b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7900c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7901d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7902e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7903f;

    public a(long j4, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f7898a = j4;
        this.f7899b = i10;
        this.f7900c = Collections.unmodifiableList(arrayList);
        this.f7901d = Collections.unmodifiableList(list);
        this.f7902e = Collections.unmodifiableList(list2);
        this.f7903f = Collections.unmodifiableList(list3);
    }
}
