package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d83 {
    public static final /* synthetic */ d83[] x = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    d83 EF5;

    public static d83 valueOf(String str) {
        return (d83) Enum.valueOf(d83.class, str);
    }

    public static d83[] values() {
        return (d83[]) x.clone();
    }
}
