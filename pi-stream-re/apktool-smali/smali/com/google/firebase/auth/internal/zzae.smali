.class public final Lcom/google/firebase/auth/internal/zzae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/firebase/auth/internal/zzaf;",
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
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v3, 0x0

    .line 8
    move v14, v3

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v12, 0x0

    .line 17
    const/4 v13, 0x0

    .line 18
    const/4 v15, 0x0

    .line 19
    const/16 v16, 0x0

    .line 20
    .line 21
    const/16 v17, 0x0

    .line 22
    .line 23
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-ge v4, v1, :cond_2

    .line 28
    .line 29
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    int-to-char v2, v4

    .line 34
    packed-switch v2, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    invoke-static {v4, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_0
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafp;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 42
    .line 43
    invoke-static {v0, v4, v2}, Lq6/g;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v17

    .line 47
    goto :goto_0

    .line 48
    :pswitch_1
    sget-object v2, Lcom/google/firebase/auth/internal/zzbj;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 49
    .line 50
    invoke-static {v0, v4, v2}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    move-object/from16 v16, v2

    .line 55
    .line 56
    check-cast v16, Lcom/google/firebase/auth/internal/zzbj;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_2
    sget-object v2, Lcom/google/firebase/auth/zzd;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 60
    .line 61
    invoke-static {v0, v4, v2}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    move-object v15, v2

    .line 66
    check-cast v15, Lcom/google/firebase/auth/zzd;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_3
    invoke-static {v4, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    goto :goto_0

    .line 74
    :pswitch_4
    sget-object v2, Lcom/google/firebase/auth/internal/zzah;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 75
    .line 76
    invoke-static {v0, v4, v2}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    move-object v13, v2

    .line 81
    check-cast v13, Lcom/google/firebase/auth/internal/zzah;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_5
    invoke-static {v4, v0}, Lq6/g;->U(ILandroid/os/Parcel;)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_0

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    const/4 v4, 0x4

    .line 93
    invoke-static {v0, v2, v4}, Lq6/g;->v0(Landroid/os/Parcel;II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_1

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move v2, v3

    .line 105
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    move-object v12, v2

    .line 110
    goto :goto_0

    .line 111
    :pswitch_6
    invoke-static {v4, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    goto :goto_0

    .line 116
    :pswitch_7
    invoke-static {v4, v0}, Lq6/g;->r(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    goto :goto_0

    .line 121
    :pswitch_8
    sget-object v2, Lcom/google/firebase/auth/internal/zzab;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 122
    .line 123
    invoke-static {v0, v4, v2}, Lq6/g;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    goto :goto_0

    .line 128
    :pswitch_9
    invoke-static {v4, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    goto :goto_0

    .line 133
    :pswitch_a
    invoke-static {v4, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    goto :goto_0

    .line 138
    :pswitch_b
    sget-object v2, Lcom/google/firebase/auth/internal/zzab;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 139
    .line 140
    invoke-static {v0, v4, v2}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    move-object v6, v2

    .line 145
    check-cast v6, Lcom/google/firebase/auth/internal/zzab;

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :pswitch_c
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 149
    .line 150
    invoke-static {v0, v4, v2}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    move-object v5, v2

    .line 155
    check-cast v5, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_2
    invoke-static {v1, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 160
    .line 161
    .line 162
    new-instance v0, Lcom/google/firebase/auth/internal/zzaf;

    .line 163
    .line 164
    move-object v4, v0

    .line 165
    invoke-direct/range {v4 .. v17}, Lcom/google/firebase/auth/internal/zzaf;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzafm;Lcom/google/firebase/auth/internal/zzab;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/auth/internal/zzah;ZLcom/google/firebase/auth/zzd;Lcom/google/firebase/auth/internal/zzbj;Ljava/util/List;)V

    .line 166
    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
    new-array p1, p1, [Lcom/google/firebase/auth/internal/zzaf;

    .line 2
    .line 3
    return-object p1
.end method
