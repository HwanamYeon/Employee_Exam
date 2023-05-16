<template>

    <v-card outlined>
        <v-card-title>
            EmployeeUser
        </v-card-title>

        <v-card-text>
            <String label="PhoneNumber" v-model="value.phoneNumber" :editMode="editMode"/>
            <Date label="JoinDate" v-model="value.joinDate" :editMode="editMode"/>
            <Boolean label="IsAdmin" v-model="value.isAdmin" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions v-if="inList">
            <slot name="actions"></slot>
        </v-card-actions>
    </v-card>
</template>

<script>
    export default {
        name: 'EmployeeUser',
        components:{},
        props: {
            value: [Object, String, Number, Boolean, Array],
            editMode: Boolean,
            isNew: Boolean,
            offline: Boolean,
            inList: Boolean,
            label: String,
        },
        data: () => ({
        }),
        async created() {
            if(!Object.values(this.value)[0]) {
                this.$emit('input', {});
                this.newValue = {
                    'phoneNumber': '',
                    'joinDate': '',
                    'isAdmin': '',
                }
            }
            if(typeof this.value === 'object') {
                if(!('phoneNumber' in this.value)) {
                    this.value.phoneNumber = '';
                }
                if(!('joinDate' in this.value)) {
                    this.value.joinDate = '2023-05-16';
                }
                if(!('isAdmin' in this.value)) {
                    this.value.isAdmin = false;
                }
            }
        },
        watch: {
            value(val) {
                this.$emit('input', val);
            },
            newValue(val) {
                this.$emit('input', val);
            },
        },

        methods: {
            edit() {
                this.editMode = true;
            },
            async add() {
                this.editMode = false;
                this.$emit('input', this.value);

                if(this.isNew){
                    this.$emit('add', this.value);
                } else {
                    this.$emit('edit', this.value);
                }
            },
            async remove(){
                this.editMode = false;
                this.isDeleted = true;

                this.$emit('input', this.value);
                this.$emit('delete', this.value);
            },
            change(){
                this.$emit('change', this.value);
            },
        }
    }
</script>

