package ru.stqa.pft.addressbook.model;

import com.google.common.collect.ForwardingSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dmitriy on 08.07.2017.
 */
public class Groups extends ForwardingSet<GroupData> {

    private Set<GroupData> delegate;

    @Override
    protected Set<GroupData> delegate() {
        return delegate;
    }

    public Groups(Groups groups) {
        this.delegate = new HashSet<GroupData>(groups.delegate());
    }

    public Groups() {
        this.delegate = new HashSet<GroupData>();
    }




    public Groups withAdded(GroupData group) {
        Groups groups = new Groups(this);
        groups.add(group);
        return groups;
    }

    public Groups without(GroupData group) {
        Groups groups = new Groups(this);
        groups.remove(group);
        return groups;
    }
}
