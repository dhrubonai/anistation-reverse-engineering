package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l23 {
    public static final l23 x;
    public static final l23 y;
    public static final /* synthetic */ l23[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l23] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l23] */
    static {
        ?? r0 = new Enum("Min", 0);
        x = r0;
        ?? r1 = new Enum("Max", 1);
        y = r1;
        z = new l23[]{r0, r1};
    }

    public static l23 valueOf(String str) {
        return (l23) Enum.valueOf(l23.class, str);
    }

    public static l23[] values() {
        return (l23[]) z.clone();
    }
}
