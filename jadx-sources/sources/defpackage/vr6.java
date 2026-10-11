package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vr6 {
    public static final vr6 x;
    public static final vr6 y;
    public static final /* synthetic */ vr6[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vr6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vr6] */
    static {
        ?? r0 = new Enum("Lsq2", 0);
        x = r0;
        ?? r1 = new Enum("Impulse", 1);
        y = r1;
        z = new vr6[]{r0, r1};
    }

    public static vr6 valueOf(String str) {
        return (vr6) Enum.valueOf(vr6.class, str);
    }

    public static vr6[] values() {
        return (vr6[]) z.clone();
    }
}
