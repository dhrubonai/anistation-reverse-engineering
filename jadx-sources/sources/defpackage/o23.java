package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o23 {
    public static final o23 x;
    public static final o23 y;
    public static final /* synthetic */ o23[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [o23, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o23, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Width", 0);
        x = r0;
        ?? r1 = new Enum("Height", 1);
        y = r1;
        z = new o23[]{r0, r1};
    }

    public static o23 valueOf(String str) {
        return (o23) Enum.valueOf(o23.class, str);
    }

    public static o23[] values() {
        return (o23[]) z.clone();
    }
}
