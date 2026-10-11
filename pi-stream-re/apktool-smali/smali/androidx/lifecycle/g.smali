.class public final Landroidx/lifecycle/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/p;Ln3/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/lifecycle/g;->a:I

    .line 1
    iput-object p1, p0, Landroidx/lifecycle/g;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/g;->c:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/lifecycle/g;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Landroidx/lifecycle/g;->b:Ljava/lang/Object;

    .line 9
    sget-object v0, Landroidx/lifecycle/d;->c:Landroidx/lifecycle/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/d;->b(Ljava/lang/Class;)Landroidx/lifecycle/b;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/g;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq0/m;Landroidx/lifecycle/s;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/g;->a:I

    const-string v0, "defaultLifecycleObserver"

    .line 3
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/lifecycle/g;->b:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, Landroidx/lifecycle/g;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V
    .locals 6

    .line 1
    iget v0, p0, Landroidx/lifecycle/g;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/lifecycle/g;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/lifecycle/g;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :pswitch_0
    sget-object p1, Landroidx/lifecycle/n;->ON_START:Landroidx/lifecycle/n;

    .line 13
    .line 14
    if-ne p2, p1, :cond_0

    .line 15
    .line 16
    check-cast v2, Landroidx/lifecycle/p;

    .line 17
    .line 18
    invoke-virtual {v2, p0}, Landroidx/lifecycle/p;->b(Landroidx/lifecycle/t;)V

    .line 19
    .line 20
    .line 21
    check-cast v1, Ln3/e;

    .line 22
    .line 23
    invoke-virtual {v1}, Ln3/e;->d()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :pswitch_1
    sget-object v0, Landroidx/lifecycle/f;->a:[I

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    aget v0, v0, v3

    .line 34
    .line 35
    packed-switch v0, :pswitch_data_1

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :pswitch_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p2, "ON_ANY must not been send by anybody"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :pswitch_3
    check-cast v2, Lq0/m;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :pswitch_4
    check-cast v2, Lq0/m;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_5
    check-cast v2, Lq0/m;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_6
    check-cast v2, Lq0/m;

    .line 66
    .line 67
    iget-object v0, v2, Lq0/m;->b:Landroidx/emoji2/text/EmojiCompatInitializer;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 73
    .line 74
    const/16 v3, 0x1c

    .line 75
    .line 76
    if-lt v0, v3, :cond_1

    .line 77
    .line 78
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Lq0/b;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    new-instance v0, Landroid/os/Handler;

    .line 88
    .line 89
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    new-instance v3, Lq0/q;

    .line 97
    .line 98
    invoke-direct {v3}, Lq0/q;-><init>()V

    .line 99
    .line 100
    .line 101
    const-wide/16 v4, 0x1f4

    .line 102
    .line 103
    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 104
    .line 105
    .line 106
    iget-object v0, v2, Lq0/m;->a:Landroidx/lifecycle/p;

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Landroidx/lifecycle/p;->b(Landroidx/lifecycle/t;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_7
    check-cast v2, Lq0/m;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :pswitch_8
    check-cast v2, Lq0/m;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    :goto_1
    check-cast v1, Landroidx/lifecycle/s;

    .line 124
    .line 125
    if-eqz v1, :cond_2

    .line 126
    .line 127
    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/s;->onStateChanged(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V

    .line 128
    .line 129
    .line 130
    :cond_2
    return-void

    .line 131
    :goto_2
    check-cast v1, Landroidx/lifecycle/b;

    .line 132
    .line 133
    iget-object v0, v1, Landroidx/lifecycle/b;->a:Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Ljava/util/List;

    .line 140
    .line 141
    invoke-static {v1, p1, p2, v2}, Landroidx/lifecycle/b;->a(Ljava/util/List;Landroidx/lifecycle/u;Landroidx/lifecycle/n;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget-object v1, Landroidx/lifecycle/n;->ON_ANY:Landroidx/lifecycle/n;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/util/List;

    .line 151
    .line 152
    invoke-static {v0, p1, p2, v2}, Landroidx/lifecycle/b;->a(Ljava/util/List;Landroidx/lifecycle/u;Landroidx/lifecycle/n;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
