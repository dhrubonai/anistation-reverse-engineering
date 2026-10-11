package x6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f11338a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f11339b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f11340c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f11341d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f11342e;

    static {
        u uVar = new u("Ready", 0);
        f11338a = uVar;
        u uVar2 = new u("NotReady", 1);
        f11339b = uVar2;
        u uVar3 = new u("Done", 2);
        f11340c = uVar3;
        u uVar4 = new u("Failed", 3);
        f11341d = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        f11342e = uVarArr;
        new c7.b(uVarArr);
    }

    public u(String str, int i10) {
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f11342e.clone();
    }
}
