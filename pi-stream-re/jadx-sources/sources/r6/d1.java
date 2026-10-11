package r6;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class d1 implements q6.f {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f9447a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d1[] f9448b;

    /* JADX INFO: Fake field, exist only in values array */
    d1 EF0;

    static {
        d1 d1Var = new d1() { // from class: r6.b1
            @Override // q6.f
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        };
        c1 c1Var = new c1();
        f9447a = c1Var;
        f9448b = new d1[]{d1Var, c1Var};
    }

    public d1(String str, int i10) {
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f9448b.clone();
    }
}
