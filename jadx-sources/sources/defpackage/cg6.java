package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cg6 {
    public static final cg6 x;
    public static final cg6 y;
    public static final /* synthetic */ cg6[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [cg6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cg6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cg6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("On", 0);
        x = r0;
        ?? r1 = new Enum("Off", 1);
        y = r1;
        z = new cg6[]{r0, r1, new Enum("Indeterminate", 2)};
    }

    public static cg6 valueOf(String str) {
        return (cg6) Enum.valueOf(cg6.class, str);
    }

    public static cg6[] values() {
        return (cg6[]) z.clone();
    }
}
