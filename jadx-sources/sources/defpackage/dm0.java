package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class dm0 {
    public static final dm0 x;
    public static final dm0 y;
    public static final /* synthetic */ dm0[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dm0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dm0] */
    static {
        ?? r0 = new Enum("GCM", 0);
        x = r0;
        ?? r1 = new Enum("CBC", 1);
        y = r1;
        z = new dm0[]{r0, r1};
    }

    public static dm0 valueOf(String str) {
        return (dm0) Enum.valueOf(dm0.class, str);
    }

    public static dm0[] values() {
        return (dm0[]) z.clone();
    }
}
