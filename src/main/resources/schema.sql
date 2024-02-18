create table users (
    id char(11) primary key comment 'ユーザーID',
    name varchar(30) not null comment 'ユーザー名',
    created_at timestamp default current_timestamp comment '作成日時',
    updated_at timestamp default current_timestamp on update current_timestamp comment '更新日時'
) comment 'ユーザー';

create table numbering (
    prefix char(3) primary key comment '接頭辞',
    next_num bigint not null default 1 comment '次回採番値'
) comment 'ナンバリング';