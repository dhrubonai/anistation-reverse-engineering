package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k23 {
    public static final k23 x;
    public static final k23 y;
    public static final /* synthetic */ k23[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k23] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k23] */
    static {
        ?? r0 = new Enum("Min", 0);
        x = r0;
        ?? r1 = new Enum("Max", 1);
        y = r1;
        z = new k23[]{r0, r1};
    }

    public static k23 valueOf(String str) {
        return (k23) Enum.valueOf(k23.class, str);
    }

    public static k23[] values() {
        return (k23[]) z.clone();
    }
}
