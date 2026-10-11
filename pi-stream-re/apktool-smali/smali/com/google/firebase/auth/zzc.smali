.class public final Lcom/google/firebase/auth/zzc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/firebase/auth/ActionCodeSettings;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v4, v1

    .line 8
    move-object v5, v4

    .line 9
    move-object v6, v5

    .line 10
    move-object v7, v6

    .line 11
    move-object v9, v7

    .line 12
    move-object v11, v9

    .line 13
    move-object v13, v11

    .line 14
    move v8, v2

    .line 15
    move v10, v8

    .line 16
    move v12, v10

    .line 17
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge v1, v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-char v2, v1

    .line 28
    packed-switch v2, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p1}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_0
    invoke-static {v1, p1}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v13

    .line 39
    goto :goto_0

    .line 40
    :pswitch_1
    invoke-static {v1, p1}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 41
    .line 42
    .line 43
    move-result v12

    .line 44
    goto :goto_0

    .line 45
    :pswitch_2
    invoke-static {v1, p1}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    goto :goto_0

    .line 50
    :pswitch_3
    invoke-static {v1, p1}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    goto :goto_0

    .line 55
    :pswitch_4
    invoke-static {v1, p1}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    goto :goto_0

    .line 60
    :pswitch_5
    invoke-static {v1, p1}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    goto :goto_0

    .line 65
    :pswitch_6
    invoke-static {v1, p1}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    goto :goto_0

    .line 70
    :pswitch_7
    invoke-static {v1, p1}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    goto :goto_0

    .line 75
    :pswitch_8
    invoke-static {v1, p1}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    goto :goto_0

    .line 80
    :pswitch_9
    invoke-static {v1, p1}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    invoke-static {v0, p1}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 86
    .line 87
    .line 88
    new-instance p1, Lcom/google/firebase/auth/ActionCodeSettings;

    .line 89
    .line 90
    move-object v3, p1

    .line 91
    invoke-direct/range {v3 .. v13}, Lcom/google/firebase/auth/ActionCodeSettings;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object p1

    .line 95
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/google/firebase/auth/ActionCodeSettings;

    .line 2
    .line 3
    return-object p1
.end method
