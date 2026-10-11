package q1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m implements u1.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9046a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9047b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9048c;

    public m(String str, List list, boolean z9) {
        this.f9046a = str;
        this.f9047b = Collections.unmodifiableList(list);
        this.f9048c = z9;
    }
}
