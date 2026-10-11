.class public final enum Lcom/google/android/gms/fido/common/Transport;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/fido/common/Transport;",
        ">;",
        "Lcom/google/android/gms/common/internal/ReflectedParcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/fido/common/Transport;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lcom/google/android/gms/fido/common/Transport;

.field public static final synthetic c:[Lcom/google/android/gms/fido/common/Transport;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lcom/google/android/gms/fido/common/Transport;

    .line 2
    .line 3
    const-string v1, "bt"

    .line 4
    .line 5
    const-string v2, "BLUETOOTH_CLASSIC"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/fido/common/Transport;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/fido/common/Transport;

    .line 12
    .line 13
    const-string v2, "ble"

    .line 14
    .line 15
    const-string v4, "BLUETOOTH_LOW_ENERGY"

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    invoke-direct {v1, v4, v5, v2}, Lcom/google/android/gms/fido/common/Transport;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lcom/google/android/gms/fido/common/Transport;

    .line 22
    .line 23
    const-string v4, "nfc"

    .line 24
    .line 25
    const-string v6, "NFC"

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    invoke-direct {v2, v6, v7, v4}, Lcom/google/android/gms/fido/common/Transport;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/google/android/gms/fido/common/Transport;

    .line 32
    .line 33
    const-string v6, "usb"

    .line 34
    .line 35
    const-string v8, "USB"

    .line 36
    .line 37
    const/4 v9, 0x3

    .line 38
    invoke-direct {v4, v8, v9, v6}, Lcom/google/android/gms/fido/common/Transport;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lcom/google/android/gms/fido/common/Transport;

    .line 42
    .line 43
    const-string v8, "internal"

    .line 44
    .line 45
    const-string v10, "INTERNAL"

    .line 46
    .line 47
    const/4 v11, 0x4

    .line 48
    invoke-direct {v6, v10, v11, v8}, Lcom/google/android/gms/fido/common/Transport;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v8, Lcom/google/android/gms/fido/common/Transport;

    .line 52
    .line 53
    const-string v10, "cable"

    .line 54
    .line 55
    const-string v12, "HYBRID"

    .line 56
    .line 57
    const/4 v13, 0x5

    .line 58
    invoke-direct {v8, v12, v13, v10}, Lcom/google/android/gms/fido/common/Transport;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sput-object v8, Lcom/google/android/gms/fido/common/Transport;->b:Lcom/google/android/gms/fido/common/Transport;

    .line 62
    .line 63
    const/4 v10, 0x6

    .line 64
    new-array v10, v10, [Lcom/google/android/gms/fido/common/Transport;

    .line 65
    .line 66
    aput-object v0, v10, v3

    .line 67
    .line 68
    aput-object v1, v10, v5

    .line 69
    .line 70
    aput-object v2, v10, v7

    .line 71
    .line 72
    aput-object v4, v10, v9

    .line 73
    .line 74
    aput-object v6, v10, v11

    .line 75
    .line 76
    aput-object v8, v10, v13

    .line 77
    .line 78
    sput-object v10, Lcom/google/android/gms/fido/common/Transport;->c:[Lcom/google/android/gms/fido/common/Transport;

    .line 79
    .line 80
    new-instance v0, Lcom/google/android/gms/common/api/y;

    .line 81
    .line 82
    const/16 v1, 0x13

    .line 83
    .line 84
    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/y;-><init>(I)V

    .line 85
    .line 86
    .line 87
    sput-object v0, Lcom/google/android/gms/fido/common/Transport;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 88
    .line 89
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/android/gms/fido/common/Transport;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static d(Ljava/lang/String;)Lcom/google/android/gms/fido/common/Transport;
    .locals 6

    .line 1
    invoke-static {}, Lcom/google/android/gms/fido/common/Transport;->values()[Lcom/google/android/gms/fido/common/Transport;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    iget-object v5, v4, Lcom/google/android/gms/fido/common/Transport;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    return-object v4

    .line 21
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string v0, "hybrid"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    sget-object p0, Lcom/google/android/gms/fido/common/Transport;->b:Lcom/google/android/gms/fido/common/Transport;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    new-instance v0, Ln5/a;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    new-array v1, v1, [Ljava/lang/Object;

    .line 39
    .line 40
    aput-object p0, v1, v2

    .line 41
    .line 42
    const-string p0, "Transport %s not supported"

    .line 43
    .line 44
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {v0, p0}, Ln5/a;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/android/gms/fido/common/Transport;
    .locals 1

    .line 1
    const-class v0, Lcom/google/android/gms/fido/common/Transport;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/fido/common/Transport;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/google/android/gms/fido/common/Transport;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/fido/common/Transport;->c:[Lcom/google/android/gms/fido/common/Transport;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/google/android/gms/fido/common/Transport;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/google/android/gms/fido/common/Transport;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fido/common/Transport;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/fido/common/Transport;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
